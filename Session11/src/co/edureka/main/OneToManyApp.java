package co.edureka.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.FoodItem;
import co.edureka.model.YourRestaurant;

public class OneToManyApp {

	public static void main(String[] args) {
		
		FoodItem item1 = new FoodItem(null, "Veggie Burger", 120);
		FoodItem item2 = new FoodItem(null, "Noodles", 180);
		FoodItem item3 = new FoodItem(null, "Dal", 130);
		
		ArrayList<FoodItem> items = new ArrayList<FoodItem>();
		items.add(item1); // 0
		items.add(item2); // 1
		//items.add(item3); // 2
		
		YourRestaurant restaurant = new YourRestaurant();
		restaurant.setName("Johns Veggies Delihgt");
		restaurant.setRatings(5);
		restaurant.setType("Indian");
		restaurant.setOpeningTime("10:00 AM");
		
		restaurant.setItems(items); // Linking of 1 to many relationship

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
			
			//session.save(restaurant); // Saving Restaurant will save FoodItems as well
			
			YourRestaurant ref = session.get(YourRestaurant.class, 2);
			System.out.println(ref);
			System.out.println(ref.getItems());
			
			transaction.commit(); // it shall save 50 restaurant objects as a Batch Operation
			
			System.out.println(">> Hibernate Transcation Finished");
			
			//session.close();
			
			
		} catch (Exception e) {
			System.out.println(">>1. Some Exception: "+e);
			e.printStackTrace();
		}
	
	}

}
