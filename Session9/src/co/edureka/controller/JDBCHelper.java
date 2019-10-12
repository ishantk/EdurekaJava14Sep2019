package co.edureka.controller;

import java.sql.CallableStatement;
// JDBC API's from java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import co.edureka.model.User;

/*
 
 	JDBC : Java Database Connectivity
 	Java App will interact with JDBC API's
 	JDBC API's interacts with Driver provided by DB vendor (.jar -> Java Archive, collection of .class files)
 	Driver will further interact with DataBase
 	
 	
 	JDBC Procedure
 	==============
 	1. Load the Driver i.e. jar file in your program
 	   1.1 Download the jar file from DB vendor Website (Need only once) | https://dev.mysql.com/downloads/connector/j/
 	   1.2 Link jar file in your Java Project
 	   	   Rt Click on Project -> Build Path -> Configure build Path -> Add External jars
 	   1.3 Use API Class.forname to load the driver in your java program
 
 	2. Create Connection with Database
 		2.1 We need url, username and password
 		2.2 Use Connection and DriverManager API's from JDBC to create connection
 		
 	3. Create SQL Statement and execute it
 		3.1 String sql = "";
 		3.2 Use Statement or PreparedStatement API to execute SQL Command
 		
 	4. Close the Connection once we have done our SQL operations to release memory resources
 		4.1 Simply execute close method on Connection Object
 
*/

// To Perform DB operations
public class JDBCHelper {
	
	Connection connection; // connection is Ref Var of Connection Interface, imported from java.sql package
	Statement statment;	   // To Execute SQL Statement
	PreparedStatement preparedStatement; // To Execute SQL Statement
	
	CallableStatement callableStatement; // To Execute Stored procedure
	
	// Step#1 Load Driver : We did it by OOPS way. We created Constructor to load driver for us !!
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// Step#2 Connection with DataBase
	public void createConnection() {
		try {
			
			String url = "jdbc:mysql://localhost/edureka"; // Last Path Segment is DB name i.e. edureka in our case
			String user = "root";
			String password = "";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created with DataBase");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// Step#3 Write and Execute SQL Command
	public int registerUser(User user) {
		int i = 0;
		
		try {
		
			String sql = "insert into User values(null, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.name);
			preparedStatement.setString(2, user.email);
			preparedStatement.setString(3, user.password);
			
			i = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return i;
	}

	
	public void loginUser(User user) {
		
		try {
			
			String sql = "select * from User where email = ? and password = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.email);
			preparedStatement.setString(2, user.password);
			
			// ResultSet is a collection containing all the rows
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {	
				user.uid = resultSet.getInt(1);
				user.name = resultSet.getString(2);
				user.email = resultSet.getString(3);
				user.password = resultSet.getString(4);
			}

		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
	}
	
	// Step#4 Close Connection
	public void closeConnection() {
		try {
			connection.close();
			System.out.println(">> 4. Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		} 
	
	}

}
