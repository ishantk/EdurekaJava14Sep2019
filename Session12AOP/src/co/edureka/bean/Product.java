package co.edureka.bean;

// Bean
public class Product {
	
	// Attributes
	int stock;
	String name;
	int price;
	
	public Product() {
		System.out.println(">> Product Object Constructed");
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [stock=" + stock + ", name=" + name + ", price=" + price + "]";
	}

	// Business Method : Logic Processing shall Happen Here
	// In Reality we will be working with data bases and services to perform all these steps which will be more complex
	// AOP says, divide your logic into small modules
	/*public void purchaseProduct(String where, String when, String paymentMethod) {
		
		// 1.
		if(stock>0) {
			
			// 2.
			System.out.println(">> Please Pay using "+paymentMethod);
			System.out.println(">> Thank you for your purchase. We shall deliver product to "+where+" by "+when);
			
			// 3.
			System.out.println(">> Send Email to Logistics");
			
		}else {
			System.out.println(">> Sorry No Stock Available");
		}
		
	}*/
	
	public void purchaseProduct(String where, String when, String paymentMethod) {
		
		// 2.
		System.out.println(">> Please Pay using "+paymentMethod);
		System.out.println(">> Thank you for your purchase. We shall deliver product to "+where+" by "+when);
		System.out.println();
		
	}
	
}
