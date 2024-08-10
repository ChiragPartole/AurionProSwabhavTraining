package com.techlabs.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	
	public void connectToDB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			statement = connection.createStatement();
			
			System.out.println("Connection sucessfull");
			
			
			DatabaseMetaData dbmd=connection.getMetaData();  
			String table[]={"TABLE"};  
			ResultSet rs=dbmd.getTables(null,null,null,table);  
			  
			while(rs.next()){  
			System.out.println(rs.getString(3));  
			}  
			ResultSet resultSet = dbmd.getTables(null, null, "%", new String[]{"TABLE"});
            System.out.println("Tables in the database:");
            while (resultSet.next()) {
                String tableName = resultSet.getString("TABLE_NAME");
                System.out.println(tableName);
            }
            
            ResultSetMetaData resultSetMetaData
            = resultSet.getMetaData();
            for (int i = 1;
                    i
                    <= resultSetMetaData.getColumnCount();
                    i++) {
                   System.out.println(
                       "ColumnName = "
                       + resultSetMetaData.getColumnName(
                             i));
                   System.out.println(
                       "ColumnType = "
                       + resultSetMetaData.getColumnType(i)
                       + "   ");
                   System.out.println(
                       "ColumnLabel = "
                       + resultSetMetaData.getColumnLabel(
                             i)
                       + "   ");
                   System.out.println(
                       "ColumnDisplaySize = "
                       + resultSetMetaData
                             .getColumnDisplaySize(i)
                       + "   ");
                   System.out.println(
                       "ColumnTypeName = "
                       + resultSetMetaData
                             .getColumnTypeName(i)
                       + "   ");
                   System.out.println(
                       "------------------");
               }
           
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
