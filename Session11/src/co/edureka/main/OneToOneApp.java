package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Address;
import co.edureka.model.MyRestaurant;

public class OneToOneApp {

	public static void main(String[] args) {
		
		MyRestaurant restaurant = new MyRestaurant();
		restaurant.setName("Johns Cafe");
		restaurant.setType("Coffe Shop");
		restaurant.setRatings(4);
		restaurant.setOpeningTime("11:00 AM");
		
		
		Address address = new Address();
		address.setAdrsLine("Country Homes");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setZipCode(520001);
		
		// Fulfillment of Relationship 
		restaurant.setAddress(address);	
		address.setRestaurant(restaurant);
		
		// We wish to save the relationship in Hibernate
		// We will have 2 tables
		// MyRestaurant | Address
		// rid			| aid
		// 1            | 1
		// rid of Restaurant will be substituted into aid of Address
		
		// Implement Hinernate API's
		
		// SessionFactory API will create Session Objects
		SessionFactory sessionFactory = null;
		
		// Session Object is Connection with DataBase
		Session session = null;
		
		// Transaction has to be used in Hibernate to perform any operation
		// Ensure Atomicity (All at once)
		Transaction transaction = null;
		
		try {
			
			// Parsing of hibernate.cfg.xml file with Hibernate API's itself
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			try {
				
				sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
				
			} catch (Exception e) {
				System.out.println(">>2. Some Exception: "+e);
				e.printStackTrace();
			}
			
			// Connection to the DataBase
			session = sessionFactory.openSession();
			//anotherSession = sessionFactory.openSession(); // We can maintain multiple sessions
			transaction = session.getTransaction(); // Obtain Reference to Transaction
			
			transaction.begin();
			
			session.save(restaurant);
			
			transaction.commit(); // it shall save 50 restaurant objects as a Batch Operation
			
			System.out.println(">> Hibernate Transcation Finished");
			
			//session.close();
			
			
		} catch (Exception e) {
			System.out.println(">>1. Some Exception: "+e);
			e.printStackTrace();
		}

	}

}
