package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.FoodItem;
import co.edureka.bean.Restaurant;

public class DIApp {

	public static void main(String[] args) {
		
		/*
		FoodItem item = new FoodItem();
		item.setName("Veggie Pizza");
		item.setPrice(200);
		
		//Restaurant restaurant = new Restaurant(item); // Constructor Injection (Linking Dependency with Constructor)
		
		Restaurant restaurant = new Restaurant();
		restaurant.setItem(item);						// Setter Injection  (Linking Dependency with Setter)
		*/
		
		// Above, we have done the way we have been doing it in Java
		// But Spring FW works on IOC Principle
		// Lets now configure XML file and manage DI thr !! :)

		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
		
		System.out.println(">> restaurant is: "+restaurant);
		//System.out.println(">> Departments: "+restaurant.getDepartments());
		
	}

}
