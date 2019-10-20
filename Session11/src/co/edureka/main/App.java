package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Restaurant;

/*
 	Hibernate Procedure:
 	1. Write a model i.e. structure of object which you wish to save
 	2. Link Hibernate Jars and MySQL Jars with your project
 		https://mvnrepository.com
 		https://mvnrepository.com/artifact/org.hibernate/hibernate-core
 	3. Copy restaurant.hbm.xml file in src directory and edit the same for mapping class with table in database
 	4. Copy hibernate.cfg.xml file in src directory and edit the same for DB specific details
 	5. In Client class i.e. with main method execute Hibernate Code
 	
 	PS: Documentation and Resources can be found at http://hibernate.org/orm/
 	
 */

public class App {

	public static void main(String[] args) {
		
		/*
		Restaurant r1 = new Restaurant();
		//r1.setRid(null);
		r1.setName("John's Cafe");
		r1.setType("Coffee Shop");
		r1.setRatings(3);
		r1.setOpeningTime("10:30 AM");
		
		Restaurant r2 = new Restaurant(null, "Fionna's Picnik Square", "Chinese", 4 ,"12:30 AM");
		Restaurant r3 = new Restaurant(null, "Cakes & Coffe", "Bakery", 5 ,"11:30 AM");

		System.out.println(">> r1 data:");
		System.out.println(r1);
		
		System.out.println(">> r2 data:");
		System.out.println(r2);
		
		System.out.println(">> r3 data:");
		System.out.println(r3);
		*/
		
		// Data in Object is temporary !! We need to save the data permanently !!
		// We will use Hibernate to perform DB operations now !!
		
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
			
			
			// 1. Insert operation using Hibernate
			//session.save(r1);
			
			//session.save(r2);
			//session.save(r3);
			
			// 2. Fetch a Single Record using Hibernate
			//Restaurant rRef = session.get(Restaurant.class, 2); // Fetch Record from Table with id as 2
			//System.out.println(">> Fetched Details: ");
			//System.out.println(rRef);
			
			// 3. Fetch Multiple Records
			// 3.1 Hibernate Qery Language (HQL)
			//String hql = "From Restaurant";
			//String hql = "From Restaurant where ratings > 3";
			//List<Restaurant> restaurants = session.createQuery(hql).list();
			
			//for(Restaurant restaurant : restaurants) {
			//	System.out.println(restaurant);
			//}
			
			// 3.2 Criteria API where we can skip HQL
			//Criteria criteria = session.createCriteria(Restaurant.class);
			//criteria.add(Restrictions.gt("ratings", 3));
			//List<Restaurant> restaurants = criteria.list();
			
			//for(Restaurant restaurant : restaurants) {
			//	System.out.println(restaurant);
			//}
			
			// 4. Update Operation
			// We fetch first and than update
			//Restaurant restaurant = session.get(Restaurant.class, 2); 
			
			// updating the attributes which we want
			//restaurant.setName("Fionna's Square");
			//restaurant.setType("IndoChinese");
			//restaurant.setOpeningTime("6 PM");
			
			//session.update(restaurant);
			
			// 5. Delete Operation
			//Restaurant restaurant = new Restaurant();
			//restaurant.setRid(2);
			
			//session.delete(restaurant); // delete's on the basis of id !!
			
			// 6. Batch Operation
			/*for(int i=1;i<=50;i++) {
				Restaurant ref = new Restaurant(null, "Restaurant "+i, "Indian", 4, "10:00 AM");
				session.save(ref); // we shall be saving 50 restaurant objects
			}*/
			
			
			//session.save(r1);
			//session.save(r2);
			//session.save(r3);
			
			System.out.println(">> Fetching 2 records from DB:");
			Restaurant r1 = session.get(Restaurant.class, 1);
			Restaurant r2 = session.get(Restaurant.class, 3);
			System.out.println(">> "+r1);
			System.out.println(">> "+r2);
			
			System.out.println(">> Re-Fetching Same 2 records from DB:");
			Restaurant r3 = session.get(Restaurant.class, 1);
			Restaurant r4 = session.get(Restaurant.class, 3);
			System.out.println(">> "+r3);
			System.out.println(">> "+r4);
			
			transaction.commit(); // it shall save 50 restaurant objects as a Batch Operation
			
			System.out.println(">> Hibernate Transcation Finished");
			
			// Till Time we do not close the session we have the data in Cache
			//session.close();
			
			
			// Till Time we do not close the sessionFactory we have the data in Cache
			//sessionFactory.close();
			
			
		} catch (Exception e) {
			System.out.println(">>1. Some Exception: "+e);
			e.printStackTrace();
		}
		
	}

}
