// Step1: Think of an Object - User
// Step2: Think of data in Object i.e. attributes of an Object
// 		User: name, phone, email, gender, age, address

// Step3: Create Class i.e. Representation of an Object textually
class User{
	
	// Attributes : written inside class, hence represents attributes of Object
	// Property of Object and not of Class | Belongs to Object
	String name;
	String phone;
	String email;
	char gender;
	int age;
	String address;
	
	// Constructors: Special Methods in Object | Property of Object and not of Class | Belongs to Object
	// Class Name with no Return Type
	// For Every Object Constructor will be executed automatically
	// DEFAULT CONSTRUCTOR Constructor takes no Input
	// RULE : Whenever object will be created in memory, constructor is the first method to be executed
	User(){
		// Give attributes some initial value
		name = "NA";
		phone = "NA";
		email = "NA";
		gender = 'U';
		age = 18;
		address = "NA";
	}
	
	// Overload Constructor
	// Inputs to Constructor
	// PARAMETERIZED CONSTRUCTOR Constructor takes Inputs
	User(String name, String phone, String email, char gender, int age, String address) {
		// Give attributes some initial value
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	
	// Method : Property of Object and not of Class | Belongs to Object
	// for write or update
	void setUserDetails(String name, String ph, String email, char gender, int age, String address) {
		//name = name; // confusion
		this.name = name;
		// this.name i.e. LHS means attribute of Object
		// name on RHS means input of method
		// this is a reference variable which points to current object
		phone = ph;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	// for read
	void showUserDetails() {
		System.out.println("-----------------");
		System.out.println(">> "+name+" is "+age+" years old and lives in "+address);
		System.out.println(">> You can contact "+name+" at "+phone+" or "+email);
		System.out.println("-----------------");
		System.out.println();
	}
}

public class OOPS {

	public static void main(String[] args) {
		
		// Step4: Create Object in Reality from Class in the memory
		// Object Construction Statement
		User uRef1 = new User(); // User(); -> Execution of Constructor
		User uRef2 = new User();  // User(); -> Execution of Constructor
		
		// Reference Copy
		User uRef3 = uRef1; // This is not an Object Construction statement. we dont have new creating object for us
		
		User uRef4 = new User(); // User(); -> Execution of Constructor
		User uRef5 = new User("Mike", "+91 98777 90000", "mike@example.com", 'M', 45, "Country Homes");  // User(); -> Execution of Paremeterized Constructor
		
		// new creates Object with attributes in Heap i.e. at Run Time
		// In Java objects are created dynamically with new i.e. at run time :)
		
		// uRef1 and uRef2 are Reference Variables which will hold HashCode of Objects
		
		System.out.println(">> uRef1 is: "+uRef1);
		System.out.println(">> uRef2 is: "+uRef2);
		System.out.println(">> uRef3 is: "+uRef3);
		System.out.println(">> uRef4 is: "+uRef4);
		System.out.println(">> uRef5 is: "+uRef5);
		
		// Dealing with Object
		// Object Operations w.r.t. attributes
		// 1. Write Data in Object
		// 2. Update Data in Object
		// 3. Read Data from Object
		// 4. Delete an Object
		
		
		// 1. Write Data in Object
		// Syntatically use Reference Variable and . operator
		/*
		uRef1.name = "John Watson";
		uRef1.phone = "+91 99999 88888";
		uRef3.email = "john@example.com";
		uRef3.gender = 'M';
		uRef1.age = 26;
		uRef3.address = "Redwood Shores";
		
		uRef2.name = "Fionna Flynn";
		uRef2.phone = "+91 88888 11111";
		uRef2.email = "fionna@example.com";
		uRef2.gender = 'F';
		uRef2.age = 28;
		uRef2.address = "Country Homes";*/
		
		uRef1.setUserDetails("John Watson", "+91 99999 88888", "john@example.com", 'M', 26, "Redwood Shores");
		uRef2.setUserDetails("Fionna Flynn", "+91 88888 11111", "fionna@example.com", 'F', 28, "Country Homes");
		
		// 2. Update Data in Object
		// Syntatically use Reference Variable and . operator
		uRef1.age = 33;
		uRef1.phone = "+91 98765 00111"; // New String in Constant Pool :(
		
		uRef2.address = "Pristine Magnum";
		
		// 3. Read Data from Object 
		//    Meaningful Read operation
		//System.out.println(">> "+uRef1.name+" is "+uRef3.age+" years old and lives in "+uRef1.address);
		//System.out.println(">> "+uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		
		uRef1.showUserDetails();
		uRef2.showUserDetails();
		
		// 4. Delete operations
		// In Java we have *Garbage Collector* which will automatically delete UN-USED OBJECTS from memory
		System.gc(); // Request to GC to remove un-used objects from memory :)
		
		// Challenge at Developers End:
		// If we wish to write/update data in object we have to write so many lines of code
		// For different objects we have to do it again and again
		
		// If we wish to modify read statement we have to modify for all 
		
		// Solution:
		// Create Methods in Object :)
		
		// uRef4 and uRef5 points to Objects which are empty
		uRef4.showUserDetails();
		uRef5.showUserDetails();

	}

}
