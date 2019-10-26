package co.edureka.dp;

interface State{
	void showState(); // Display State 
}

class Placed implements State{
	public void showState() {
		System.out.println(">> Order State is: PLACED");
	}
}

class Cancelled implements State{
	public void showState() {
		System.out.println(">> Order State is: CANCELLED");
	}
}

class Order{
	
	State state; // Has-A Relationship
	
	void changeState(State state) {
		this.state = state; 
	}
	
	void orderState() {
		state.showState();
	}
}


class Customer{
	
	Order order; // Has-A Relationship
	
	void createOrder() {
		
		order = new Order();
		
		State state = new Placed();
		order.changeState(state);
		
	}
	
	void cancelOrder() {
		
		State state = new Cancelled();
		order.changeState(state);
		
	}
	
}


class Restaurant{
	
}


class Accepted{
	
}

class Rejected{
	
}




public class StateApp {

	public static void main(String[] args) {
		

		Customer customer = new Customer();
		customer.createOrder();
		
		customer.order.orderState();
		
		customer.cancelOrder();
		customer.order.orderState();
		
	}

}
