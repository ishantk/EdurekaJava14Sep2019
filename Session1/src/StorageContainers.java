// Java Program
// StorageContainers is name of class
// What is class -> Later !!
public class StorageContainers {
	
	// in the class we have main method
	// what is main : it will be executed when we execute our Java Program
	// whatever as in programming instruction we will writ in main will be executed
	// main will execute instructions sequentially i.e. line by line the way we will write it
	public static void main(String[] args) {
		// Instructions written in this block will be executed

		// SINGLE VALUE CONTAINERS
		
		// 1. Container Creation Instruction(Statement)
		byte age = 10;
		// age is name of storage container
		// byte defines the type and size (8 bits)
		// 10 is data and is constant, is value and we call it a literal 
		
		int number = 20;
		// number is name of storage container
		// int defines the type and size(32 bits)
		// 20 is data and is constant, is value and we call it a literal
		
		char ch = 'A';
		// ch is name of storage container
		// char defines the type as character data and size(16 bits)
		// A is data and is constant, is value and we call it a literal
		
		double priceAfterTax = 1024.78;
		// priceAfterTax is name of storage container
		// double defines the type (decimal values) and size(64 bits)
		// 1024.78 is data and is constant, is value and we call it a literal
		
		boolean internet = true;
		// internet is name of storage container
		// boolean defines the type (logical value : either true or false) and size(8 bits)
		// true is data and is constant, is value and we call it a literal
		
		
		// 2. Read Instructions
		// We will read data from Containers and show it to the User :)
		System.out.println("Age is: "+age);
		System.out.println("Number is: "+number);
		System.out.println("ch is: "+ch);
		System.out.println("priceAfterTax is: "+priceAfterTax);
		System.out.println("internet is: "+internet);
		
		System.out.println("******************");
		
		// 3. Update Instructions
		// When we have to update data in storage containers we don't specify the type as it is used to create
		age = 22;
		number = 111;
		ch = '\u20b9'; // Unicode value
		priceAfterTax = 999.54;
		internet = false;
		
		System.out.println("Age now is: "+age);
		System.out.println("Number now is: "+number);
		System.out.println("ch now is: "+ch);
		System.out.println("priceAfterTax now is: "+priceAfterTax);
		System.out.println("internet now is: "+internet);
		
		// 4. Delete Instructions
		// In Java everything shall be deleted automatically for us :)
	}
	// When main will be finished i.e. all the instructions are executed, containers from RAM will be deleted :)

}
