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

public class AccountsDB {

	private Connection connection;
	private Statement statement;
	private static AccountsDB dbAccounts;
	private PreparedStatement preparedStatement;
	
	private AccountsDB() {
		
	}
	
	public static AccountsDB getAccountDb() {
		if(dbAccounts == null)
			dbAccounts = new AccountsDB();
		return dbAccounts;
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
	
	public List<Account> getAllAccounts() {
		connectToDb();
		ResultSet dbAccounts = null;
		List<Account> accounts = new ArrayList<Account>();
		try {
			dbAccounts = statement.executeQuery("SELECT a.accountID,a.accountNumber,a.balance,c.customerID,c.firstname,c.lastname,c.customeremail\r\n" + 
					"from accounts a \r\n" + 
					"INNER JOIN customers c ON a.customerID = c.customerID;");
			
			while(dbAccounts.next()) {
				accounts.add(new Account(dbAccounts.getInt(1),
						dbAccounts.getInt(2),dbAccounts.getDouble(3),
						dbAccounts.getInt(4),dbAccounts.getString(5),
						dbAccounts.getString(6),dbAccounts.getString(7)));
			}
			
			for(Account account: accounts) {
				System.out.println(account);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accounts;
	}

	public void addAccount(int accountID, int accountNumber, double balance, int customerID) throws SQLException {


		
			preparedStatement = connection.prepareStatement("Insert into accounts values(?,?,?,?)");
			preparedStatement.setInt(1,accountID );
			preparedStatement.setInt(2,accountNumber );
			preparedStatement.setDouble(3,balance );
			preparedStatement.setInt(4,customerID );
			
			
			preparedStatement.executeUpdate();
			System.out.println("Account added successfully");
			
			
	
		
	}

	
	
}
