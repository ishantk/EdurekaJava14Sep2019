package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.bean.Connection;

public class App {

	public static void main(String[] args) {
		
		// Traditionally, we create Objects in our code by ourselves
		
		/*
		Connection c1 = new Connection();
		c1.setUrl("jdbc:mysql://localhost/abc");
		c1.setUsername("john");
		c1.setPassword("john123");
		
		Connection c2 = new Connection("jdbc:mysql://localhost/xyz", "fionna", "fionna123");
		
		System.out.println(">> c1 is: "+c1);
		System.out.println(">> c2 is: "+c2);
		*/
		
		// Challenge: 
		// In case data in Connection Object changes, we have to re-build the code and re-deploy it to production
		// Spring FW as Solution
		// We don't create objects, we will configure data for Object in an XML file instead
		
		// Inversion of Control | IOC
		// The way we create objects is now inverted
		// Spring FW will create objects and we just need to configure the data in XML file
		// This is majorly for the Objects which needs configuration data !! eg: Settings Object in Application
		
		// IOC procedure:
		// 1. Link the Project with *Spring Core* Jar Files
		//	  mvnrepository.com
		//	  https://spring.io/	
		// 2. Create a Bean
		// 3. Copy xml file into src directory and configure the bean
		// 4. In main class, write Spring IOC Code
		// 	  4.1 IOC Container -> BeanFactory
		// 	  4.2 IOC Container -> ApplicationContext
		//	  IOC Containers will be responsible to read XML file and create Objects for us !! They will even manage the life-cycle of Object (Construction and Destruction)
		
		
		/*
		// Resource shall be performing IO Operation i.e. read/parse XML file
		Resource resource = new ClassPathResource("beans.xml");
		// IOC Container : Create/Manage Objects for us
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// >> BeanFactory will create Objects right only when you have requested for them !!
		
		// Request for Object from Spring IOC Container
		//Connection c1 = factory.getBean("con1", Connection.class);
		//Connection c2 = (Connection)factory.getBean("con2");
		
		//System.out.println(">> c1 is: "+c1);
		//System.out.println(">> c2 is: "+c2);
		*/
		
		// >> ApplicationContext will create Objects right away even if we have not requested for them !!
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Request for Object from Spring IOC Container
		//Connection c1 = context.getBean("con1", Connection.class);
		//Connection c2 = (Connection)context.getBean("con2");
		
		//System.out.println(">> c1 is: "+c1);
		//System.out.println(">> c2 is: "+c2);
		
		// Let us Re-Request the Same Object again and again
		Connection c1 = context.getBean("con1", Connection.class);
		//Connection c2 = context.getBean("con1", Connection.class);
		//Connection c3 = context.getBean("con1", Connection.class);
		
		System.out.println(">> c1 is: "+c1);
		//System.out.println(">> c2 is: "+c2);
		//System.out.println(">> c3 is: "+c3);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
		

	}

}
