package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] array = {10, 20, 30, 40, 50};
		int a=10, b=3,c=0;
		
		try {
			c = a/b; // when error comes here, control will be shifted to catch block and below instructions will not be executed in try
			System.out.println(">> array[10] is: "+array[10]);	// error
		}/*catch(ArithmeticException aRef) { // ArrayIndexOutOfBoundsException is a Built In Class
			// JVM will create an Object of ArrayIndexOutOfBoundsException, will write message in it and throw it
			System.out.println(">> Some Arithmetic Exception : "+aRef);
		}catch(ArrayIndexOutOfBoundsException aRef) { // ArrayIndexOutOfBoundsException is a Built In Class
			// JVM will create an Object of ArrayIndexOutOfBoundsException, will write message in it and throw it
			System.out.println(">> Some Array Exception : "+aRef);
		}*/
		catch(Exception eRef) { // Exception is Parent to all Exceptions and as per RTP: Parent's ref can point to any child object
			//System.out.println(">> Exception is: "+eRef); // Will give the message
			eRef.printStackTrace(); // Line Numbers as well
		}
		finally { // will be executed in case exception comes or not :)
			System.out.println(">> Important Statement");
		}
		
		System.out.println(">> c is: "+c);					// 3
		
		System.out.println(">> Work hard and get Luckier !!");
		
		System.out.println(">> App Finished");

	}

}

// Normal/Graceful termination of program i.e. main starts and finishes
// Abnormal/Disgraceful termination of program i.e. main starts but not finishes -> CRASH
// CRASH -> You get an error eg: ArrayIndexOutOfBoundsException and from that line number itself program will not execute further
// Exception : Error which occurred at Run Time :)
//			   Whenever we get an exception program will crash
// 			   if our program repeatedly crashes, OS will notify user to un-install the app :(
// 			   Hence, Exceptions must be Handled :)
// Handling Errors at Run Time : try and catch 

// Exceptions : CHECKED and UNCHECKED
// UNCHECKED  : RuntimeException Class and its children are Unchecked Exceptions
// CHECKED    : Other than RuntimeException all are Checked


/*
 		// try alone is an error
 		try{
 		
 		}
 		
 		try{
 		
 		}catch(){
 		
 		}
 		
 		// this will not handle error but will execute finally before crash
 		try{
 		
 		}finally{
 		
 		}
 		
 		try{
 		
 		}catch(){
 		
 		}finally{
 		
 		}
 		
 		try{
 		
 		}catch(){
 		
 		}catch(){
 		
 		}finally{ // finally is always 1
 		
 		}
 		
 		try{
 			try{
 		
	 		}catch(){
	 		
	 		}finally{
	 		
	 		}
 		}catch(){
	 		try{
	 		
	 		}catch(){
	 		
	 		}finally{
	 		
	 		}
 		}finally{
 			try{
	 		
	 		}catch(){
	 		
	 		}finally{
	 		
	 		}
 		}
 		
 
 
 */

