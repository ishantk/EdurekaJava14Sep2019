package co.edureka.main;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import co.edureka.controller.MyHandler;
import co.edureka.controller.XMLHelper;
import co.edureka.model.Customer;

public class App {

	public static void main(String[] args) {
		
		/*
		System.out.println(">> App Started");
		
		// Object in memory
		Customer cRef = new Customer(1, "John", "+91 99999 88888", "john@example.com");
		//System.out.println(cRef);
		
		// Object contains data which is temporarily in the RAM
		// We can persist the data i.e. save data 
		// 1. Plain Files i.e. .csv or .txt etc
		// 2. XML Files
		// 3. Database :)
		
		XMLHelper helper = new XMLHelper();
		helper.saveCustomer(cRef); // Generate an XML file with data in object saved in tags of that XML file
		
		
		System.out.println(">> App Finished");
		*/
		
		/*XMLHelper helper = new XMLHelper();
		ArrayList<Customer> customers = helper.parseXML();
		
		for(Customer cRef : customers) {
			System.out.println(cRef);
			System.out.println("---------------------");
		}*/
		
		try {
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			
			//File file = new File("/Users/ishantkumar/Downloads/customers-oct6.xml");
			File file = new File("/Users/ishantkumar/Downloads/products.xml");
			
			MyHandler handler = new MyHandler();
			
			parser.parse(file, handler);
			
		}catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}

}
