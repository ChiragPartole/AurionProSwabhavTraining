package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.techlabs.exceptions.UsernameNotFoundException;


public class UsersDB {

	private Connection connection;
	private Statement statement;
	private static UsersDB dbUsers;
	private PreparedStatement preparedStatement;
	private UsersDB() {
		
	}
	
	public static UsersDB getdbUsers() {
		if(dbUsers == null)
			dbUsers = new UsersDB();
		return dbUsers;
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
	
	public ResultSet getAllUsers() {
		ResultSet users = null;
		
		try {
			users = statement.executeQuery("SELECT u.*,r.rolename FROM miniproject_bankapp.users u "
					+ "INNER JOIN miniproject_bankapp.roles r "
					+ "ON u.roleID = r.roleID;");
			
			while(users.next()) {
				System.out.println(users.getString("username")+","+ 
			users.getString("userpassword")+","+ users.getString("rolename"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	
	public boolean validateCredentials(String username, String password, String role) {
        String query = "SELECT u.username, u.userpassword, r.rolename " +
                       "FROM users u " +
                       "INNER JOIN roles r ON u.roleID = r.roleID " +
                       "WHERE u.username = ? AND u.userpassword = ? AND r.rolename = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password); // Note: Store hashed passwords instead of plain text
            preparedStatement.setString(3, role);
            
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next(); // Returns true if a matching record is found
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Consider using a logger instead
        }
        return false;
    }

	public void changeDetails(String currentUsername, String username, String password) {
		if(!usernameExists(currentUsername)) {
			throw new UsernameNotFoundException();
		}
		try {
			preparedStatement = connection.prepareStatement("UPDATE users SET username = ?,userpassword = ? WHERE username = ?;");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, currentUsername);
			
			preparedStatement.executeUpdate();
			System.out.println("changed username and password! new username:"+username+
					" new password: "+password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean usernameExists(String currentUsername) {
		
		try {
			preparedStatement = connection.prepareStatement("SELECT * from users WHERE username =? ;");
			preparedStatement.setString(1, currentUsername);
			
			ResultSet result = preparedStatement.executeQuery();
			
			if(result.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
//error aa raha
//	public boolean validateCredentials(String username, String password,String role) { 
//		
//		ResultSet dbUsers = getAllUsers();
//		System.out.println(username +",,"+password+",,"+ role);
//		try {  
//			while(dbUsers.next()) {
//				if(dbUsers.getString("username").equals(username)) {
//					System.out.println("username mathched");
//					if(dbUsers.getString("userpassword").equals(password)) {
//						System.out.println("password matched");
//						if(dbUsers.getString("rolename").equals(role)) {
//							System.out.println("role matched");
//							return true;
//						}
//						
//					}
//					
//				}
//			}
//		}catch (SQLException e) 
//		{    
//			e.printStackTrace();
//		} 
//		return false;
//	}
	
	
}
