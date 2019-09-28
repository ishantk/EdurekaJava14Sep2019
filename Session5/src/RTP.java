// Run Time Polymorphism

/*class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 100;
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destination) {
		System.out.println(">> Cab Booked from "+source+" to "+destination+". Please Pay: \u20b9"+baseFare);
	}
	
}*/

// Refine RTP implementation : Make Class as Abstract :) 
/*abstract class Cab{ // for which YOU cannot create objects, But JVM i.e. RTE will create object of cab so as to follow RULE of Inheritance
	
	int baseFare;
	
	Cab(){
		baseFare = 100;
		System.out.println(">> Cab Object Constructed");
	}
	
	// abstract method is created in the abstract class
	// abstract method has no definition.
	// *abstract method is a RULE by Parent to be defined by Child*
	// if Parent has n-number of Rules i.e. abstract methods all of them must be defined by Children
	abstract void bookCab(String source, String destination); // This method's definition was of no use
	
}*/

// Let us convert abstract class to interface and observe changes:
// Change1 : We cannot create constructors in interface: Neither YOU nor JVM can now create its Objects
//			 Hence RULE of Inheritance breaks as we will have no objects of Cab anytime in memory now.
//			 With interface we cannot have objects :) Hence, No Inheritance :)

// Change2: Attributes in Interface are by default public static final
interface Cab{ // for which YOU cannot create objects, But JVM i.e. RTE will create object of cab so as to follow RULE of Inheritance
	
	int baseFare = 100; // final attribute which cannot be changed
						// public static final int baseFare = 100; // static : Property of Interface 
	
	/*
	Cab(){
		baseFare = 100;
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// RULE from Interface
	// Interfaces cannot be extended as they are no more Parent Objects. Rule of Inheritance breaks.
	// They are implemented
	void bookCab(String source, String destination); // This method's definition was of no use
	// public abstract void bookCab(String source, String destination);
	
}

class UberGo implements Cab{ //extends Cab{ // IS-A Relationship | Inheritance
	
	int fare;
	
	UberGo(){
		fare = baseFare + 50;
		System.out.println(">> UberGo Object Constructed");
	}
	
	// Why Override ? So as to customize i.e. change the Parent's definition as per our need.
	public void bookCab(String source, String destination) {
		System.out.println(">> UberGo Booked from "+source+" to "+destination+". Please Pay: \u20b9"+fare);
	}
}

class Moto implements Cab{ //extends Cab{ // IS-A Relationship | Inheritance
	
	int fare;
	
	Moto(){
		fare = baseFare + 10;
		System.out.println(">> Moto Object Constructed");
	}
	
	// Why Override ? So as to customize i.e. change the Parent's definition as per our need.
	public void bookCab(String source, String destination) {
		System.out.println(">> Moto Booked from "+source+" to "+destination+". Please Pay: \u20b9"+fare);
	}
}

class Premier implements Cab{ //extends Cab{ // IS-A Relationship | Inheritance
	
	int fare;
	
	Premier(){
		fare = baseFare + 75;
		System.out.println(">> Premier Object Constructed");
	}
	
	// Why Override ? So as to customize i.e. change the Parent's definition as per our need.
	public void bookCab(String source, String destination) {
		System.out.println(">> Premier Booked from "+source+" to "+destination+". Please Pay: \u20b9"+fare);
	}
}

public class RTP {

	public static void main(String[] args) {
		
		/*
		Cab cRef;
		cRef = new Cab();
		
		cRef.bookCab("Country Home", "Pristine Magnum");
		*/
		
		/*
		UberGo uRef;
		uRef = new UberGo(); // Rule of Inheritance :Before Object of Child, Object of Parent is constructed in memory :)
		
		uRef.bookCab("Country Home", "Pristine Magnum"); // Execute Child's definition.
		*/
		
		// Polymorphic Statement : Reference Variable of Parent, Can Point to the Child Object
		//						   Reference Variable of Interface, Can Point to the Object which implements it	
		
		Cab cRef; 			 // Reference Variable of Parent | Reference Variable of Interface
		
		
		System.out.println(">> Selecting UberGo");
		cRef = new UberGo(); // Can Point to the Child Object | Can Point to the Object which implements Cab Interface
		cRef.bookCab("Country Home", "Pristine Magnum"); // Execute Child's Definition due to Overriding :)
		
		System.out.println();
		System.out.println(">> Selecting Moto");
		
		cRef = new Moto();
		cRef.bookCab("Country Home", "Pristine Magnum");
		
		System.out.println();
		System.out.println(">> Selecting Premier");
		
		cRef = new Premier();
		cRef.bookCab("Country Home", "Pristine Magnum");
		
		// Parent's Ref Var sometimes points to UberGo or to Moto or to Premier										 // More than 1 Form
		// cRef.bookCab("Country Home", "Pristine Magnum"); -> Shows Different Outputs as in to what cRef points 	 // More than 1 Form
		
		// Challenge #1
		// Two Challenges faced when we are implementing RTP:
		// User can create object of simple Cab
		
		//System.out.println();
		//System.out.println(">> Selecting Cab");
		//cRef = new Cab(); 								 // 1. Generalized Cab and not a Specific Cab
		//cRef.bookCab("Country Home", "Pristine Magnum");   // 2. Prints out a general Cab booking
		
		// Resolution for Challenge #1
		// Having the Object of Cab constructed by us will be of no sense and similarly method bookCab in it will be quite generic.
		// We made class as abstract and so as method in it !!
		// Hence, now we cannot create its object, so accessing method is no longer available :)
		
		// Challenge #2
		// RTP and RULE of INHERITANCE
		// Parent Objects are created in memory which have no usage :)
		
		// Resolution for Challenge #2
		// Use Interfaces :)
	}

}

/*
 		Payments: Credit/Debit Card, Wallet, Net Banking, UPI etc... | RTP
 		Login   : phone+otp, email+pwd, google, fb, twitter, github  | RTP
 		many more examples :)
*/
 

