package co.edureka.main;

import java.util.ArrayList;
import java.util.Scanner;

import co.edureka.controller.JDBCHelper;
import co.edureka.model.Customer;

public class JDBCApp {

	public static void main(String[] args) {
		
		System.out.println(">> App Started <<");
		/*
		Scanner scanner = new Scanner(System.in);
		
		Customer customer = new Customer();
		
		System.out.println(">> Add Customer Name:");
		customer.name = scanner.nextLine();
		System.out.println(">> Add Customer Phone:");
		customer.phone = scanner.nextLine();
		System.out.println(">> Add Customer Email:");
		customer.email = scanner.nextLine();
		
		System.out.println(">> Customer Details: "+customer);
		// Once Program finishes, data shall be lost
		// We must save the data in the database now permanently
		 */
		
		//Customer customer = new Customer(0, "Mike Johnson", "+91 90000 00001", "mike.j@example.com");
		
		
		// 1. Load the Driver
		JDBCHelper db = new JDBCHelper();
		
		// 2. Create Connection
		db.createConnection();
		
		// 3. Write and Execute SQL
		//db.insertCustomer(customer);
		//db.updateCustomer(customer);
		//db.deleteCustomer(3);
		/*
		ArrayList<Customer> customers = db.fetchAllCustomers();
		
		for(Customer cRef : customers) {
			System.out.println("----------------------");
			System.out.println(cRef);
		}
		*/
		
		//Customer cRef = db.fetchCustomer(2);
		//System.out.println(cRef);
		
		//db.executeProcedure(customer);
		
		db.executeBatchTransaction();
		
		// 4. Close the Connection
		db.closeConnection();
		
		System.out.println(">> App Finished <<");

	}

}
