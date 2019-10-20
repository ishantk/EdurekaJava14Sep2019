package co.edureka.main;

//import org.springframework.aop.framework.ProxyFactoryBean; // This must be configured in XML File so as our AOP Works
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Product;

public class AOPApp {

	// Link Spring Core and Spring AOP Jars
	
	public static void main(String[] args) {

		// IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Product product = context.getBean("pRef", Product.class);
		Product product = context.getBean("pRefProxy", Product.class);
		
		System.out.println(">> product is: "+product);
		
		System.out.println("**********PURCHASE***********");
		
		product.purchaseProduct("Redwood Shores", "Evening 6PM", "NetBaning");
		
		System.out.println("**********PURCHASE***********");
		
		
		

	}

}
