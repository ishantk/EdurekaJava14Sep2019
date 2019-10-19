package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Burger;
import co.edureka.model.FoodItem;
import co.edureka.model.VeggieBurger;

public class InheritanceApp {

	public static void main(String[] args) {
		
		
		FoodItem item = new FoodItem();
		item.setName("Noodles");
		item.setPrice(100);

		Burger burger = new Burger();
		burger.setName("Mc Burger");
		burger.setPrice(200);
		burger.setBurgerName("Spicey Paneer");
		burger.setDressing("Tomato and Mayo");
		
		VeggieBurger veggieBurger = new VeggieBurger();
		veggieBurger.setName("Mc Veggie");
		veggieBurger.setPrice(150);
		veggieBurger.setBurgerName("Spicey Aloo Patty");
		veggieBurger.setDressing("Tomato, Mint and Mayo");
		veggieBurger.setHerbs("Oreganos");
		veggieBurger.setSpice(3);
		
		System.out.println(item);
		System.out.println();
		
		System.out.println(burger);
		System.out.println();
		
		System.out.println(veggieBurger);
		System.out.println();
		
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
			
			session.save(item);
			session.save(burger);
			session.save(veggieBurger);
			
			transaction.commit(); // it shall save 50 restaurant objects as a Batch Operation
			
			System.out.println(">> Hibernate Transcation Finished");
			
			//session.close();
			
			
		} catch (Exception e) {
			System.out.println(">>1. Some Exception: "+e);
			e.printStackTrace();
		}
		

	}

}
