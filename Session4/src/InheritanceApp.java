class Father{
	
	// Attributes: Property of Object
	String name;
	String vehicle;
	int wealth;

	// Constructors: Property of Object 
	Father(){
		name = "John";
		vehicle = "DL10AB2233";
		wealth = 100000;
		System.out.println(">> Father Object Constructed");
	}
	
	Father(String name, String vehicle, int wealth){
		this.name = name;
		this.vehicle = vehicle;
		this.wealth = wealth;
	}
	
	// Method: Property Of Object
	void showDetails() {
		System.out.println(">> "+name+" drives vehicle "+vehicle+" and has \u20b9"+wealth);
	}
	
}

class Son extends Father{ // IS-A Relationship | We have inheritance relationship between Father and Son
	
	// Attribute : Property of Son Object
	String name;
	//String vehicle;
	String comapnyName;
	
	Son(){
		
		name = "Mike";
		//vehicle = "DL20XY1111";
		comapnyName = "ABC International";
		
		System.out.println(">> Son Object Constrcuted");
	}
	
	// Method: Property of Object, which is accessing property of Parent 
	//void showMyDetails() {
	//	System.out.println(">> "+name+" drives "+vehicle+" and works for "+comapnyName+" and has a wealth of "+wealth);
	//}
	
	// Overriding : ReDefine the same method which Parent has in Child to customize :)
	void showDetails() {
		System.out.println(">> "+name+" drives "+vehicle+" and works for "+comapnyName+" and has a wealth of "+wealth);
	}
	
}

public class InheritanceApp {

	public static void main(String[] args) {
		
		//Father fRef = new Father("John Watson", "DL10AB2233", 100000);

		//Father fRef = new Father();
		//fRef.showDetails();
		
		// 1. RULE OF INHERITANCE : Before Object of Child, Object of Parent is Constructed in Memory
		// Object Construction Statement
		Son sRef = new Son();
		
		
		// 2. RULE OF INHERITANCE : Child Object can access properties of Parent Object, if Child will not have it :)
		//sRef.showDetails(); 	// showDetails is method of Parent which child can access
		//sRef.showMyDetails();   // showMyDetails is method of child
		
		sRef.showDetails(); // Now Child has the same method as Parent had. So Child method will be executed
	}

}

/*
 	
 	Types of Inheritance
 	1. Single Level
 	
 	CA
 	|
 	CB
 	
 	class CA{
 	
 	}
 	
 	class CB extends CA{
 	
 	}
 	
 	2. Multi Level
 	
 	CA
 	|
 	CB
 	|
 	CC
 	
 	class CA{
 	
 	}
 	
 	class CB extends CA{
 	
 	}
 	
 	class CC extends CB{
 	
 	}
 	
 	3. Hierarchy
 	CA
 	|
  CB CC
  
  	class CA{
  	
  	}
  	
  	class CB extends CA{
  	
  	}
  	
  	class CC extends CA{
  	
  	}
  	
  	4. Multiple | Not Supported in Java
  	CA	 CB
  	   |
  	   CC
  	   
  	class CA{
  	
  	}
  	
  	class CB{
  	
  	}
  	
  	class CC extends CA, CB{ // error in Java
  	
  	}
  	 
 	5. Hybrid
 	1 + 2 + 3
 	
 	CA
 	|
 	CB
 	|
 	CC
 	|
 CD	  CE
       |
     CF CG 	
 	
 	
 */
