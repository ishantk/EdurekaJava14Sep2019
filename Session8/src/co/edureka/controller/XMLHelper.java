package co.edureka.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import co.edureka.model.Customer;

public class XMLHelper {
	
	// Customer Object Reference is taken as input
	public void saveCustomer(Customer customer) {
		
		try {
			System.out.println("===Details to be Saved in XML File===");
			System.out.println(customer);
			System.out.println("==============");
			
			// Lets write Code to Generate XML File and Save details of Customer in it !!
			// DocumentBuilderFactory uses newInstance static method to get an object created
			//DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			//DocumentBuilder builder = factory.newDocumentBuilder();
			//Document document = builder.newDocument();
			
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			
			// Document is a kind of tree structure where we will save our data 
			
			// In XML File, we need tags
			// customers -> customer -> cid, name, phone, email
			
			Element elmRoot = document.createElement("customers");
			Element elmCustomer = document.createElement("customer");
			Element elmCid = document.createElement("cid");
			Element elmName = document.createElement("name");
			Element elmPhone = document.createElement("phone");
			Element elmEmail = document.createElement("email");
			
			// We need to put data in these tags
												  // convert any type to String for XML data
			Text txtCid = document.createTextNode(String.valueOf(customer.cid));
			Text txtName = document.createTextNode(customer.name);
			Text txtPhone = document.createTextNode(customer.phone);
			Text txtEmail = document.createTextNode(customer.email);
			
			// Text Objects should be appended into the Elements
			elmCid.appendChild(txtCid);
			elmName.appendChild(txtName);
			elmPhone.appendChild(txtPhone);
			elmEmail.appendChild(txtEmail);
			
			elmCustomer.appendChild(elmCid);
			elmCustomer.appendChild(elmName);
			elmCustomer.appendChild(elmPhone);
			elmCustomer.appendChild(elmEmail);
			
			elmRoot.appendChild(elmCustomer);
			
			document.appendChild(elmRoot); // data for XML is available as a tree structure in the document object
			
			// Finally transform document object to XMl File
			
			File file = new File("/Users/ishantkumar/Downloads/customers-oct6.xml");
			FileOutputStream outputStream = new FileOutputStream(file);
			StreamResult result = new StreamResult(outputStream);
			
			DOMSource source = new DOMSource(document);
			
			// API Transformer to be Used to do so !!
			//TransformerFactory tFactory = TransformerFactory.newInstance();
			//Transformer transformer = tFactory.newTransformer();
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			
			transformer.transform(source, result);
			
			System.out.println(">> XML File "+file.getName()+" Created !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
		
		
	}
	
	
	public ArrayList<Customer> parseXML() {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/customers-oct6.xml");
			
			// Here we are not creating new document, rather parse method is used to read XML file and create document object loaded with data
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
			
			String rootNode = document.getDocumentElement().getNodeName();
			System.out.println(">> Root Element is: "+rootNode);
			
			NodeList nodeList = document.getElementsByTagName("customer");
			System.out.println(">> "+nodeList.getLength()+" customer elements found");
			
			for(int i=0;i<nodeList.getLength();i++) {
				Node node = nodeList.item(i);
				Element element = (Element)node; // Downcast Node to Element
				
				Customer customer = new Customer();
				customer.cid = Integer.parseInt(element.getElementsByTagName("cid").item(0).getTextContent());
				customer.name = element.getElementsByTagName("name").item(0).getTextContent();
				customer.phone = element.getElementsByTagName("phone").item(0).getTextContent();
				customer.email = element.getElementsByTagName("email").item(0).getTextContent();
				
				// Add customer Object in ArrayList
				customers.add(customer);
			}
			
			
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
		
		return customers;
				
	}

}
