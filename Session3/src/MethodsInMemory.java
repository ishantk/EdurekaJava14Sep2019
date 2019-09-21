
public class MethodsInMemory {

	void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(">> sum is: "+sum);
		//System.out.println(">> a is: "+a); // error : a belongs to main method and not add method
	}
	
	/*
	int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	*/
	
	// Whenever we run our java program main is executed first :)
	public static void main(String[] args) {
		
		int a = 10;		// Creation Statement
		int b = 20;		// Creation Statement
		
		MethodsInMemory mRef = new MethodsInMemory();  // Creation Statement
		
		mRef.add(a, b); // Execution Statement
		
		//System.out.println(">> num1 is: "+num1); 	// error : num1 belongs to add method and not main method
		
		int c = a - b;	// Creation + Computation Statement
		System.out.println(">> c is: "+c);
		
	}

}
