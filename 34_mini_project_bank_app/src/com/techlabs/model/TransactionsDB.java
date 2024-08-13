package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.entity.Account;
import com.techlabs.entity.Customer;
import com.techlabs.entity.Transaction;
import com.techlabs.exceptions.InsufficientBalanceException;
import com.techlabs.exceptions.NegativeAmountException;

public class TransactionsDB {

	private Connection connection;
	private Statement statement;
	private static TransactionsDB dbTransactions;
	private PreparedStatement preparedStatement;
	
	private TransactionsDB() {
		
	}
	
	public static TransactionsDB getDbTransactions() {
		if(dbTransactions == null)
			dbTransactions = new TransactionsDB();
		return dbTransactions;
	}
	
	public void connectToDb() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject_bankapp","root","root");
			statement = connection.createStatement();
			System.out.println("Connection sucessfull");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public List<Transaction> viewTransactions() {
		connectToDb();
		ResultSet dbTransactions = null;
		List<Transaction> transactions = new ArrayList<Transaction>();
		try {
			dbTransactions = statement.executeQuery("SELECT t.senderAccNo,t.receiverAccNo,d.type,t.amount,"
					+ "t.date from transactions t " + 
					"INNER JOIN transaction_types d ON t.transactionTypesID = d.transactionTypesID;");
			
			while(dbTransactions.next()) {
				transactions.add(new Transaction(dbTransactions.getInt(1),
						dbTransactions.getInt(2),
						dbTransactions.getString(3),dbTransactions.getInt(4),
						dbTransactions.getDate(5)));
			}
			
			for(Transaction transaction: transactions) {
				System.out.println(transaction);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactions;
	}

	
	public List<Transaction> viewPassbook(String username) {
		connectToDb();
		ResultSet dbTransactions = null;
		List<Transaction> transactions = new ArrayList<Transaction>();
		
		try {
			preparedStatement = connection.prepareStatement("SELECT t.senderAccNo,t.receiverAccNo,d.type,t.amount,t.date from transactions t \r\n" + 
					"		INNER JOIN transaction_types d ON t.transactionTypesID = d.transactionTypesID\r\n" + 
					"		WHERE t.senderAccNo = (SELECT a.accountNumber FROM accounts a INNER JOIN customers c ON\r\n" + 
					"		a.customerID = c.customerID \r\n" + 
					"		WHERE c.customerID = (SELECT customerID FROM customers \r\n" + 
					"		WHERE userID = (SELECT userID from users WHERE username = ?))) OR d.type=\"transfer\";;");
			preparedStatement.setString(1, username);
			dbTransactions = preparedStatement.executeQuery();
			
			while(dbTransactions.next()) {
				
				transactions.add(new Transaction(dbTransactions.getInt(1),dbTransactions.getInt(2)
						,dbTransactions.getString(3),dbTransactions.getInt(4),
						dbTransactions.getDate(5)
						));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return transactions;
	}

	public void newTransactionTransfer(String currentUser, double amount, int receiverAccNo) {
		
		if(amount <0) {
			throw new NegativeAmountException();
		}
		if(amount>getAccountBalance(currentUser)) {
			throw new InsufficientBalanceException();
		}
		try {
			
			
			// debit
			preparedStatement = connection.prepareStatement("UPDATE accounts\r\n" + 
					"		JOIN (\r\n" + 
					"		    SELECT a.accountNumber\r\n" + 
					"		    FROM accounts a\r\n" + 
					"		    JOIN customers c ON a.customerID = c.customerID\r\n" + 
					"		    WHERE c.customerID = (\r\n" + 
					"		        SELECT customerID\r\n" + 
					"		        FROM customers\r\n" + 
					"		        WHERE userID = (\r\n" + 
					"		            SELECT userID\r\n" + 
					"		            FROM users\r\n" + 
					"		            WHERE username = ?" + 
					"		        )\r\n" + 
					"		    )\r\n" + 
					"		) AS subquery ON accounts.accountNumber = subquery.accountNumber\r\n" + 
					"		SET accounts.balance = accounts.balance - ?" + 
					"");
			preparedStatement.setString(1, currentUser);
			preparedStatement.setDouble(2, amount);
			preparedStatement.executeUpdate();
			
			//credit 
			preparedStatement = connection.prepareStatement("update accounts \r\n" + 
					"			SET balance = balance + ?\r\n" + 
					"			WHERE accountNumber = ?;");
			preparedStatement.setDouble(1, amount);
			preparedStatement.setInt(2, receiverAccNo);
			preparedStatement.executeUpdate();
			
			
			String type = "transfer";
						
			addTransactionInPassBook(type,receiverAccNo,currentUser,amount);
			
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public double getAccountBalance(String currentUser) {
		double balance = 0;
		try {
			preparedStatement = connection.prepareStatement("SELECT a.balance FROM accounts a INNER JOIN customers c ON\r\n" + 
					"a.customerID = c.customerID \r\n" + 
					"WHERE c.customerID = (SELECT customerID FROM customers \r\n" + 
					"WHERE userID = (SELECT userID from users WHERE username = ?));");
			preparedStatement.setString(1, currentUser);
			
			ResultSet result = preparedStatement.executeQuery();
			
			while(result.next()) {
				balance = result.getDouble(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return balance;
	}

	public void newTransactionDebit(String currentUser, double amount) {

		if(amount <0) {
			throw new NegativeAmountException();
		}
		if(amount>getAccountBalance(currentUser)) {
			throw new InsufficientBalanceException();
		}
		try {
			preparedStatement = connection.prepareStatement("UPDATE accounts" + 
					"		JOIN (" + 
					"		    SELECT a.accountNumber\r\n" + 
					"		    FROM accounts a\r\n" + 
					"		    JOIN customers c ON a.customerID = c.customerID\r\n" + 
					"		    WHERE c.customerID = (\r\n" + 
					"		        SELECT customerID\r\n" + 
					"		        FROM customers\r\n" + 
					"		        WHERE userID = (\r\n" + 
					"		            SELECT userID\r\n" + 
					"		            FROM users\r\n" + 
					"		            WHERE username = ?" + 
					"		        )\r\n" + 
					"		    )\r\n" + 
					"		) AS subquery ON accounts.accountNumber = subquery.accountNumber\r\n" + 
					"		SET accounts.balance = accounts.balance - ?" + 
					"");
			preparedStatement.setString(1, currentUser);
			preparedStatement.setDouble(2, amount);
			preparedStatement.executeUpdate();
			
			
			String type = "debit";
			
		
			
			int receiverAccNo = getAccNumber(currentUser);
			addTransactionInPassBook(type,receiverAccNo,currentUser,amount);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



	public void newTransactionCredit(String currentUser, Double amount) {
		if(amount <0) {
			throw new NegativeAmountException();
		}
		
		try {
			preparedStatement = connection.prepareStatement("UPDATE accounts\r\n" + 
					"		JOIN (\r\n" + 
					"		    SELECT a.accountNumber\r\n" + 
					"		    FROM accounts a\r\n" + 
					"		    JOIN customers c ON a.customerID = c.customerID\r\n" + 
					"		    WHERE c.customerID = (\r\n" + 
					"		        SELECT customerID\r\n" + 
					"		        FROM customers\r\n" + 
					"		        WHERE userID = (\r\n" + 
					"		            SELECT userID\r\n" + 
					"		            FROM users\r\n" + 
					"		            WHERE username = ?" + 
					"		        )\r\n" + 
					"		    )\r\n" + 
					"		) AS subquery ON accounts.accountNumber = subquery.accountNumber\r\n" + 
					"		SET accounts.balance = accounts.balance + ?" + 
					"");
			preparedStatement.setString(1, currentUser);
			preparedStatement.setDouble(2, amount);
			preparedStatement.executeUpdate();
			
			
			String type = "credit";
			int receiverAccNo = getAccNumber(currentUser);
			addTransactionInPassBook(type,receiverAccNo,currentUser,amount);
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	
	private void addTransactionInPassBook(String type, int receiverAccNo, String currentUser, double amount) {
		// TODO Auto-generated method stub
		int transactionTypeID = 0;
		if("debit".equals(type)) {
			transactionTypeID = 2;
		}
		else if("credit".equals(type)) {
			transactionTypeID = 1;
		}
		else if("transfer".equals(type)) {
			transactionTypeID = 3;
		}
		
		try {
			
			int transactionID = generateNewTransactionId();
			int senderAccNo = getAccNumber(currentUser);
			
			preparedStatement = connection.prepareStatement("INSERT into transactions values(?,?,current_date(),?,?,?);");
			preparedStatement.setInt(1, transactionID);
			preparedStatement.setDouble(2, amount);
			preparedStatement.setInt(3, senderAccNo);
			preparedStatement.setInt(4, receiverAccNo);
			preparedStatement.setInt(5, transactionTypeID);
			
			preparedStatement.executeUpdate();
			
			System.out.println("transaction added in passbook");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 private int getAccNumber(String currentUser) {
		 int accountNumber =0;
		 ResultSet accNumber = null;
		 
		 try {
			preparedStatement = connection.prepareStatement("SELECT a.accountNumber FROM accounts a INNER JOIN customers c ON\r\n" + 
			 		"a.customerID = c.customerID \r\n" + 
			 		"WHERE c.customerID = (SELECT customerID FROM customers \r\n" + 
					"WHERE userID = (SELECT userID from users WHERE username = ?));");
			
			preparedStatement.setString(1, currentUser);
			accNumber = preparedStatement.executeQuery();
			
			while(accNumber.next()) {
				accountNumber = accNumber.getInt(1);
			}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return accountNumber;
	}

	public int generateNewTransactionId() {
	        String checkUserSQL = "SELECT MAX(transactionID) FROM transactions";

	        try (
	             PreparedStatement checkStatement = connection.prepareStatement(checkUserSQL);
	             ResultSet resultSet = checkStatement.executeQuery()) {

	            if (resultSet.next()) {
	                int maxTransactionId = resultSet.getInt(1);
	                return maxTransactionId + 1;
	            } else {
	                // If the table is empty, start with userID 1
	                return 1;
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error generating new userID", e);
	        }
	    }
	
	
	
	
	}

