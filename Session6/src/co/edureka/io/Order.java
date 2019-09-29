package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

// Object is Parent class in Java for all : any class which we create in java will have Object as its parent

//public class Order extends Object{
public class Order {

	public int orderId;
	public String customerName;
	public String restaurantName;
	public int price;
	
	public Order() {
	
	}

	public Order(int orderId, String customerName, String restaurantName, int price) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.restaurantName = restaurantName;
		this.price = price;
	}
	
	// Override toString function of Object class
	public String toString() {
		return orderId+","+customerName+","+restaurantName+","+price+"\n";
	}
	
	
	public void saveOrder() {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/orders-29-9-19.csv");
			
			/*
			// FileOutputStream API  writes the data in the form of bytes
			// FileOutputStream stream = new FileOutputStream(file);    // to write data in File
			FileOutputStream stream = new FileOutputStream(file, true); // true -> enable append mode
			
			String data = toString();
			
			stream.write(data.getBytes()); // string to byte :)
			
			stream.close(); // to release memory resources
			System.out.println(">> Order Saved");
			*/
			
			// FileWriter API  writes the data as text i.e. String directly
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true);
			String data = toString();
			writer.write(data);
			writer.close();
			
			System.out.println(">> Order Saved");
			
		}catch (Exception e) {
			System.out.println(">> Some Eexception: "+e);
		}
	}
	
	/*
	public void readOrders() {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/orders-29-9-19.csv");
			
			// FileInputStream API will read data as bytes
			FileInputStream stream = new FileInputStream(file);
			
			int b = 0;
			
			while((b = stream.read()) != -1) { // -1 means end of file
				char ch = (char)b;
				System.out.print(ch);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Eexception: "+e);
		}
	}*/
	
	public void readOrders() {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/orders-29-9-19.csv");
			
			// FileReader API will read data as characters
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // Reads data line by line
			
			String line = "";
			int sum = 0;
			
			while((line = buffer.readLine()) != null) { // null means no more data to be read in file
				System.out.println(line);
				
				String[] data = line.split(",");
				String price = data[3];
				
				// Wrapper Class : to convert Strings into possible types
				int iPrice = Integer.parseInt(price);
				sum = sum + iPrice;
			}
			
			buffer.close();
			reader.close();
			
			System.out.println(">> Total Sales: "+sum);
			
		} catch (Exception e) {
			System.out.println(">> Some Eexception: "+e);
		}
	}
}
