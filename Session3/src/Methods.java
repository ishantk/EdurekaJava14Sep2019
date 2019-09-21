import java.util.Scanner; // Import a Built In Class Called Scanner in our Program to read data enetered by User from Console

// Method or Function

public class Methods {
	
	
	// We create a Method in class. NOT in main :)
	// Input is an amount on which we need to compute firstly the discount and after that taxes
	
	// amount, discount, taxes, amountToPay (result)
	
	
	// NON STATIC
	double calculate(double amount, double discount, double taxes) {
		
		// We do some computation here
		double amountToPay = amount - discount;
		amountToPay = amountToPay + taxes;
		
		return amountToPay; // we send back our actual result with return statement lastly
	}
	
	
	// void means we cannot return :)
	// NON STATIC
	void applyPromoCode(double amount, int code) {
		
		double amountToPay = 0;
		
		if(code == 10) {
			amountToPay = amount - (0.10 * amount);
		}else if(code == 20) {
			amountToPay = amount - (0.20 * amount);
		}else {
			System.out.println(">> Sorry No Discounts");
		}
		
		System.out.println(">> Code Applied "+code+" and Final Amount to Pay is: "+amountToPay);
	}
	
	// If we try to write the same function again we get error
	// PS: Signature cannot be same i.e. combination of function name and input types
	
	// STATIC
	static double calculateAgain(double amount, double discount, double taxes) {
		
		// We do some computation here
		double amountToPay = amount - discount;
		amountToPay = amountToPay + taxes;
		
		return amountToPay; // we send back our actual result with return statement lastly
	}
	
	// void means we cannot return :)
	// STATIC
	static void applyPromoCodeAgain(double amount, int code) {
		
		double amountToPay = 0;
		
		if(code == 10) {
			amountToPay = amount - (0.10 * amount);
		}else if(code == 20) {
			amountToPay = amount - (0.20 * amount);
		}else {
			amountToPay = amount;
			System.out.println(">> Sorry No Discounts");
		}
		
		System.out.println(">> Code Applied "+code+" on amount "+amount+" and Final Amount to Pay is: "+amountToPay);
	}
	
	// Method is created in class. It may be non static or static.
	// For a method to be static we put a keyword static in front of it, and if we don't put it it becomes non static

	public static void main(String[] args) {
		
		System.out.println(">> Welcome !!");
		
		// we know main is executed when we run our Java Program
		// main is also a Method : main is name. its return type is void. it is a static method. It takes array of String as input. It is public.
		
		// To execute other methods which we have created in class we can execute them from here in the main :)
		
		// 1. Execution of NON STATIC Methods
		//    Create an Object of Class and with its reference we execute the Method
		//    What is Object : Future Discussion

		System.out.println("=====STATIC METHODS=====");
		
		// OBJECT CONSTRUCTION STATEMENT
		// ClassName refName = new ClassName(); // new will create an Object in memory and will return HashCode to refName
		Methods mRef = new Methods(); 			// mRef is a Reference Variable which will hold HashCode of Object just like in Arrays
		
		mRef.applyPromoCode(1000.0, 20);
		mRef.applyPromoCode(500.0, 10);
		
		// Benefit to have a method -> We can execute it again and again with different inputs
		
		//double result = mRef.calculate(3250.45, 770.67, 120.29); // amountToPay will be returned from method and we will store it here in result
		//System.out.println(">> Amount to be Paid is: "+result);
		
		System.out.println(">> Amount to be paid is: "+mRef.calculate(3250.45, 770.67, 120.29)); // Execute the method in syso statement to save creating extra variables in memory
		System.out.println(">> Amount to be paid is: "+mRef.calculate(2135.0, 330.0, 98.0));
		
		System.out.println("=====NON STATIC METHODS=====");
		
		// 2. Execution of STATIC Methods
		//    Simply use name of class to execute the method. We need not to create Object Here :)
		
		Methods.applyPromoCodeAgain(1270, 20);
		
		double result = Methods.calculateAgain(3250.45, 770.67, 120.29);
		System.out.println(">> Amount to be Paid is: "+result);

		System.out.println(">> Amount to be paid is: "+Methods.calculateAgain(3250.45, 770.67, 120.29));
		
		// Relationship is getting developed here: (We will be exploring it soon)
		// NON STATIC : Object' Property
		// STATIC	  : Class's Property
		
		// Lets take Inputs from User
		
		// Scanner : Built in Class which we need to import in our Program
		Scanner scanner = new Scanner(System.in); // scanner is Reference Variable which can be any name of your choice
		
		System.out.println(">> Enter Amount");
		double amount = scanner.nextDouble(); // Read double value from User
		
		System.out.println(">> Enter Promo Code");
		int promoCode = scanner.nextInt(); 	  // nextInt, nextDouble are non static methods which are accessed with reference variable of Scanner Object
		
		scanner.close(); // Release memory resources
		
		Methods.applyPromoCodeAgain(amount, promoCode); // Inputs which are taken from User
		
	}

}
