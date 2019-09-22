// Think of an Object  : FoodItem
// Associate attributes: name, price, quantity
// Create Class
class FoodItem{
	
	// Attributes: Property of Object
	String name;
	int price;
	int quantity;
	
	// Attribute: Property of Class
	static int itemCount;
	
	// Constructors: Property of Object
	FoodItem(){
		name = "NA";
		price = 0;
		quantity = 0;
		itemCount = 0; // Rule: Property of Object i.e. Constructors or Methods can access Property of Class
	}
	
	FoodItem(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		itemCount = 0;
	}
	
	// Methods: Property of Object
	void showFoodItem() {
		System.out.println(">> "+name+"\t\u20b9"+price+"\tQuantity "+quantity);
	}
	
	void incrementQuantity() {
		quantity++;
		itemCount++; // Rule: Property of Object i.e. Constructors or Methods can access Property of Class
	}
	
	// Rule: non static  methods can access static attributes
	void decrementQuantity() {
		quantity--;
		itemCount--; // Rule: Property of Object i.e. Constructors or Methods can access Property of Class
	}
	
	// Methods: Property of Class
	// Rule: static method cannot access non static attributes 
	static void showFoodItemCount() {
		System.out.println(">> Item Count: "+itemCount);
	}
}


public class StaticApp {

	public static void main(String[] args) {
		
		FoodItem item1 = new FoodItem("Mixed Paratha", 70, 0); // IC: 0
		FoodItem item2 = new FoodItem("Aaloo Paratha", 60, 0); // IC: 0
		FoodItem item3 = item1; // Reference Copy :)
		
		item1.incrementQuantity(); // MP: 1  IC: 1
		item2.incrementQuantity(); // AP: 1	 IC: 2
		item3.incrementQuantity(); // MP: 2  IC: 3
		
		item1.incrementQuantity(); // MP: 3  IC: 4
		item2.incrementQuantity(); // AP: 2  IC: 5
		item3.incrementQuantity(); // MP: 4  IC: 6
		
		item1.decrementQuantity(); // MP: 3  IC: 5
		item2.incrementQuantity(); // AP: 3  IC: 6
		item3.incrementQuantity(); // MP: 4  IC: 7
		
		item2.decrementQuantity(); // AP: 2  IC: 6
		
		item1.showFoodItem(); // >> Mixed Paratha 70  Quantity 4
		item2.showFoodItem(); // >> Aaloo Paratha 60  Quantity 2
		item3.showFoodItem(); // >> Mixed Paratha 70  Quantity 4
		
		FoodItem.showFoodItemCount();
		
		// Next, Implement Logic to calculate totalPrice :)

	}

}
