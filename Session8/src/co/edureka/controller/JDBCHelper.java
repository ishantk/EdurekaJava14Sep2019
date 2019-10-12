package co.edureka.controller;

import java.sql.CallableStatement;
// JDBC API's from java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Customer;

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
	public void insertCustomer(Customer customer) {
		try {
			
			/*
//			String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"')";
			
			// Get the Reference to Statement Object from Connection so that we can execute S
			statment = connection.createStatement();
			int i = statment.executeUpdate(sql); // executeUpdate method will help to perform, insert, update and delete SQL Commmands Execution
			*/
			
			String sql = "insert into Customer values(null, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setString(3, customer.email);
			
			int i = preparedStatement.executeUpdate();
			
			if(i>0) {
				System.out.println(">> 3. SQL Query Executed Successfully");
			}else {
				System.out.println(">> Some Error in executing SQL Command");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void updateCustomer(Customer customer) {
		try {
			
	
			String sql = "update Customer set name = ?, phone = ?, email = ? where cid = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setString(3, customer.email);
			preparedStatement.setInt(4, customer.cid);
			
			int i = preparedStatement.executeUpdate();
			
			if(i>0) {
				System.out.println(">> 3. SQL Query Executed Successfully");
			}else {
				System.out.println(">> Some Error in executing SQL Command");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void deleteCustomer(int cid) {
		try {
			
			String sql = "delete from Customer where cid = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, cid);
			
			int i = preparedStatement.executeUpdate();
			
			if(i>0) {
				System.out.println(">> 3. SQL Query Executed Successfully");
			}else {
				System.out.println(">> Some Error in executing SQL Command");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public ArrayList<Customer> fetchAllCustomers() {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			
			String sql = "select * from Customer";
			preparedStatement = connection.prepareStatement(sql);
			
			// ResultSet is a collection containing all the rows
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) { // Till time we have next row available we get true, false in case no more row
				
				Customer customer = new Customer();
				//customer.cid = resultSet.getInt("cid");
				customer.cid = resultSet.getInt(1);
				customer.name = resultSet.getString(2);
				customer.phone = resultSet.getString(3);
				customer.email = resultSet.getString(4);
				 
				//System.out.println(customer);
				customers.add(customer);
			}

			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return customers;
	}
	
	public Customer fetchCustomer(int cid) {
		
		Customer customer = new Customer();
		
		try {
			
			String sql = "select * from Customer where cid = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, cid);
			
			// ResultSet is a collection containing all the rows
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {	
				customer.cid = resultSet.getInt(1);
				customer.name = resultSet.getString(2);
				customer.phone = resultSet.getString(3);
				customer.email = resultSet.getString(4);
			}

		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return customer;
	}
	
	public void executeProcedure(Customer customer) {
		try {
			
			
			String sql = "{ call addCustomer(?, ?, ?) }"; // execution of stored procedure with SQL Command
			callableStatement = connection.prepareCall(sql);
			callableStatement.setString(1, customer.name);
			callableStatement.setString(2, customer.phone);
			callableStatement.setString(3, customer.email);
			
			callableStatement.execute();
			System.out.println(">> Procedure executed");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void executeBatchTransaction() {
		try {
			
			String sql1 = "update Customer set name = 'Joe Jackson' where cid = 5";
			String sql2 = "delete from Customer where customerid = 7"; // putting up error intentionally by mentioning wring column name
			
			statment = connection.createStatement();
			connection.setAutoCommit(false); // We will manage as transaction ourselves
			
			// Add as many as statements needed to execute as a batch
			statment.addBatch(sql1);
			statment.addBatch(sql2);
			
			statment.executeBatch();
			connection.commit(); // Let Batch execute as a Transaction
			System.out.println(">> Transaction Finished");
		
		} catch (Exception e) {
			
			System.out.println(">> Some Exception: "+e);
			
			try {
				System.out.println(">> Rolling Back Transaction");
				connection.rollback(); // rollback function throws Exception
			}catch (Exception e1) {
				System.out.println(">> Error While Rolling Back !! "+e);
			}
			
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
