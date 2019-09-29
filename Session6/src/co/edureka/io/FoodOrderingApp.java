package co.edureka.io;

import java.util.Scanner;

public class FoodOrderingApp {

	public static void main(String[] args) {
		
		System.out.println("==Welcome==");
		
		/*
		System.out.println(">> Enter Order Details");
		System.out.println("-----------------------");
		
		Scanner scanner = new Scanner(System.in);
		Order order = new Order();
		
		System.out.println(">> Enter Order ID:");
		order.orderId = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println(">> Enter Customer Name:");
		order.customerName = scanner.nextLine();
		
		
		System.out.println(">> Enter Restaurant Name:");
		order.restaurantName = scanner.nextLine();
				
		System.out.println(">> Enter Order Price:");
		order.price = scanner.nextInt();
		
		System.out.println(">> Details for Order:");
		System.out.println(order); // Printing Reference Variable will now not show HashCode rather will show data
								   // Since, we over-rided toString method which will be automatically called when we print reference variable
		
		order.saveOrder();
		*/
		
		Order order = new Order();
		order.readOrders();

	}

}
