package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.entity.Customer;

public class CustomersDB {

	private Connection connection;
	private Statement statement;
	private static CustomersDB dbCustomers;
	private PreparedStatement preparedStatement;
	
	private CustomersDB() {
		
	}
	
	public static CustomersDB getDbCustomers() {
		if(dbCustomers == null)
			dbCustomers = new CustomersDB();
		return dbCustomers;
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
	
	public void addNewCustomer(int customerID, String firstname, String lastname, String email, String password) {
		
		try {
			int newUserId = getUserID(email);
			
			System.out.println("newUserId: "+newUserId);
			preparedStatement = connection.prepareStatement("Insert into customers values(?,?,?,?,?,?)");
			preparedStatement.setInt(1,customerID );
			preparedStatement.setString(2, firstname);
			preparedStatement.setString(3, lastname);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, password);
			preparedStatement.setInt(6,newUserId );
			
			preparedStatement.executeUpdate();
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
}
	


	public boolean customerIDExists(int customerID) {
	        String checkQuery = "SELECT COUNT(*) FROM customers WHERE customerID = ?";
	        
	        try { 
	        	
	        	preparedStatement = connection.prepareStatement(checkQuery);
	        	preparedStatement.setInt(1, customerID);
	            try (ResultSet rs = preparedStatement.executeQuery()) {
	                if (rs.next()) {
	                    return rs.getInt(1) > 0; // Return true if count is greater than 0
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return false; // Return false if an exception occurs or no records are found
	    }
	   
	   
	   public List<Integer> getAllCustomerIds(){
		   connectToDb();
		   List<Integer> customerIDList = new ArrayList<Integer>();
		   
		   try {
			ResultSet customerIds = statement.executeQuery("SELECT customerID from customers;");
			
			while(customerIds.next()) {
				customerIDList.add(customerIds.getInt(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		   return customerIDList;
	   }

	public Customer displayCustomer(int idSelected) {
		
		Customer customer = null;
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM customers WHERE customerID =?;");
			preparedStatement.setInt(1, idSelected);
			ResultSet selectedCustomer = preparedStatement.executeQuery();
			
			while(selectedCustomer.next()) {
				
				customer =new Customer(selectedCustomer.getInt("customerID"),selectedCustomer.getString("firstname")
						,selectedCustomer.getString("lastname"),selectedCustomer.getString("customeremail")
						,selectedCustomer.getString("password"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}
	
	public List<Customer> getAllCustomers() {
		connectToDb();
		ResultSet dbCustomers = null;
		List<Customer> customers = new ArrayList<Customer>();
		try {
			dbCustomers = statement.executeQuery("SELECT * from customers;");
			
			while(dbCustomers.next()) {
				customers.add(new Customer(dbCustomers.getInt(1),
						dbCustomers.getString(2),dbCustomers.getString(3),
						dbCustomers.getString(4),dbCustomers.getString(5)));
			}
			
			for(Customer customer: customers) {
				System.out.println(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}
	
	
	
public void addUser(String email, String password) {
		
		try {
			int newUserId = generateNewUserId();
			
			preparedStatement = connection.prepareStatement("Insert into users values(?,?,?,2)");
			preparedStatement.setInt(1,newUserId );
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, password);
			
			preparedStatement.executeUpdate();
			System.out.println("user added successfully, username: "+email+"password: "+password);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 public int generateNewUserId() {
	        String checkUserSQL = "SELECT MAX(userID) FROM users";

	        try (
	             PreparedStatement checkStatement = connection.prepareStatement(checkUserSQL);
	             ResultSet resultSet = checkStatement.executeQuery()) {

	            if (resultSet.next()) {
	                int maxUserId = resultSet.getInt(1);
	                return maxUserId + 1;
	            } else {
	                // If the table is empty, start with userID 1
	                return 1;
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error generating new userID", e);
	        }
	    }
	
	 
	   private int getUserID(String email) {
		   int ans = 0;
		   
		   try {
			preparedStatement = connection.prepareStatement("SELECT userID from users where username = ?;");
			
			preparedStatement.setString(1, email);
			 ResultSet resultSet = preparedStatement.executeQuery();
			 
			 while(resultSet.next()) {
				 ans = resultSet.getInt(1);
			 }
				 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ans;
	}
    
}


