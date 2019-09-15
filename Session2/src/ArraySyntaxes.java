// Java Program Means must have a class
public class ArraySyntaxes {
	
	// main method will be executed when we will execute this Java Program
	public static void main(String[] args) {
		// whatever we write in the main will be executed in  a sequence

		// Array CREATION Statements	
		
		// Syntax #1	|	Implicit Syntax -> Compiler on behalf of us will append new int[] in the syntax
		int[] jenniesMarks = {90, 75, 89, 67, 95};
		//int jenniesMarks[] = {90, 75, 89, 67, 95};
		
		System.out.println(">> jenniesMarks is: "+jenniesMarks); // HashCode of Array in the Heap
		// jenniesMarks is a Reference Variable which holds HashCode of Array
		
		
		// Syntax #2	| Explicit Syntax -> We are mentioning new int[]
		int[] johnsMarks = new int[]{93, 83, 89, 77, 95};
		//int johnsMarks[] = new int[]{90, 75, 89, 67, 95};
		
		System.out.println(">> johnsMarks is: "+johnsMarks); // HashCode of Array in the Heap
		
		// new -> is operator which will create Array at RUN-TIME (When Program Runs)
		// new int[] -> new has to create a new int array :)
		
		// Read Elements of Array
		// Indexing begins from goes till n-1 where n is size of array
		System.out.println(">> jenniesMarks for 3rd index is: "+jenniesMarks[3]);  // 67
		System.out.println(">> johnsMarks for 2nd index is: "+johnsMarks[2]);	   // 89
		
		System.out.println(">> Size of jenniesMarks is: "+jenniesMarks.length);
		
		// Syntax #3	|	No Data in the elements and by default for int its all 0's
		int[] fionnasMarks = new int[5];
		//int fionnasMarks[] = new int[5];
		
		// Array READ Statements
		System.out.println(">> fionnasMarks is: "+fionnasMarks); // HashCode of Array in the Heap
		System.out.println(">> fionnasMarks for 1st index is: "+fionnasMarks[1]);	// 0
		System.out.println(">> fionnasMarks for 3rd index is: "+fionnasMarks[3]);	// 0
		
		// PS: Arrays come with Sizes which is fixed and we cannot change them later :)
		//     For Dynamic Sizes like Shopping Cart and All we need to use data structures in Java like LinkeedList, Stack, Queue etc...
		
		// Array UPDATION Statements
		jenniesMarks[1] = 59;
		johnsMarks[3] = 99;
		fionnasMarks[1] = 80;
		fionnasMarks[3] = 90;
		
		// Re-Reading Fionna'ss Data from Array
		System.out.println(">> fionnasMarks is: "+fionnasMarks); // HashCode of Array in the Heap
		System.out.println(">> fionnasMarks for 1st index is: "+fionnasMarks[1]);	// 80
		System.out.println(">> fionnasMarks for 2nd index is: "+fionnasMarks[2]);	// 0
		System.out.println(">> fionnasMarks for 3rd index is: "+fionnasMarks[3]);	// 90
		
		// Reading the Entire Array
		System.out.println("===Reading Entire Array with For Loop===");
		// 1. Using a Loop -> for Loop
		for(int idx=0; idx<fionnasMarks.length; idx++) {	// idx will have initial value as 0 and last value as 4
			System.out.println(">> fionnasMarks for index "+idx+" is: "+fionnasMarks[idx]);	
		}
		
		// 2. Using a Loop -> Enhanced For Loop | As of now only on Arrays and in future on data structures :)
		// Here we dont worry about indexes, starting point, conditions or incrementing the idx
		// Automatically values of indexes starting from 0 will be copied to element variable one by one
		// element can be any name of your choice
		for(int element : fionnasMarks) {			// element is only available till the loop is !! we can re use it as it will be newly created again
			System.out.println(">> "+element);
		} // loop finishes here and so will element !!
		
		System.out.println();
		
//		double[] taxes = {23.5, 12.85, 10,0, 19.25, 6.5};
//		for(double anyName : taxes) {
//			System.out.println(">> "+anyName);
//		}
		
		for(double anyName : new double[]{23.5, 12.85, 10,0, 19.25, 6.5}) {
			System.out.println(">> "+anyName);
		} // the moment loop finishes anyName and array will be finished :)
		
	
	} 

}
