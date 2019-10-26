package co.edureka.dp;

import java.util.Scanner;

interface FoodItem{
	int getPrice();
	String getDescription();
}

class VeggieBurger implements FoodItem{

	public int getPrice() {
		return 100;
	}
	
	public String getDescription() {
		return "Veggie Burger with extra cheese and Spices.";
	}
}

abstract class FoodItemDecorator implements FoodItem{
	
	FoodItem item;
	
	public FoodItemDecorator(FoodItem item) {
		this.item = item;
	}
	
	public int getPrice() {
		return item.getPrice();
	}
	
	public String getDescription() {
		return item.getDescription();
	}
}

class BurgerMeal extends FoodItemDecorator{

	public BurgerMeal(FoodItem item) {
		super(item);
	}
	
	public int getPrice() {
		return item.getPrice() + 80;
	}
	
	public String getDescription() {
		return item.getDescription()+" [Converted to Meal with Fries and Coke]";
	}
}


public class DecoratorApp {

	public static void main(String[] args) {
		
		VeggieBurger burger = new VeggieBurger();
		System.out.println("-------------Burger Details----------------");
		System.out.println(">> Details: "+burger.getDescription());
		System.out.println(">> Price: \u20b9"+burger.getPrice());
		System.out.println("-----------------------------");
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> Would you like to convert your Burger into a Meal (yes/no)");
		String choice = scanner.nextLine();
		
		System.out.println();
		
		if(choice.equals("yes")) {
			BurgerMeal meal = new BurgerMeal(burger); // Decoration
			System.out.println("-------------Meal Details----------------");
			System.out.println(">> Details: "+meal.getDescription());
			System.out.println(">> Price: \u20b9"+meal.getPrice());
			System.out.println("-----------------------------");
		}

	}

}
