
public class Overloading {

	void add(int a, int b) {
		int result = a + b;
		System.out.println(">> Result with 2 inputs: "+result);
	}
	
	// Not Overloading : Return type cannot overload
	/*int add(int a, int b) {
		int result = a + b;
		return result;
	}*/
	
	/*
	void add(int x, int y) { // Method Duplicated even if you change names of inputs
		int result = x + y;
	}*/
	
	// Same method Name with Different Inputs
	// Overloading :)
	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(">> Result with 3 inputs: "+result);
	}
	
	void add(double a, double b) {
		double result = a + b;
		System.out.println(">> Result with 2 inputs: "+result);
	}
	
	void add(int a, double b) {
		double result = a + b;
		System.out.println(">> Result with 2 inputs: "+result);
	}
	
	void add(double a, int b) {
		double result = a + b;
		System.out.println(">> Result with 2 inputs: "+result);
	}
	
	// Rules to Overload:
	// 1. Method Name should be same
	// 2. Inputs must be different and unique
	//    2.1 Number of Inputs
	//    2.2 Type of Inputs
	//    2.3 Sequence of Inputs
	// 3. Return Type has no role to play when it comes to overloading a method
	
	public static void main(String[] args) {
	
		Overloading oRef = new Overloading();
		oRef.add(10, 20);
		oRef.add(10, 20, 30);
		oRef.add(10, 20.22);
		oRef.add(10.11, 20.22);
		oRef.add(10.11, 2);
		
	}

}
