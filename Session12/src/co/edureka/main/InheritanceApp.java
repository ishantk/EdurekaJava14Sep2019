package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.FoodItem;
import co.edureka.bean.Pizza;

public class InheritanceApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance.xml");
		
		FoodItem item = context.getBean("fRef", FoodItem.class);
		System.out.println(">> item is: "+item);
		
		System.out.println();
		
		Pizza pizza = context.getBean("pRef", Pizza.class);
		System.out.println(">> pizza is: "+pizza);

	}

}
