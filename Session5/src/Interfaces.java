// In Interfaces we define only RULES i.e. abstract methods or final attributes :)
interface PayTMGateway{
	void registerUser(String email, String phone); // methods in interfcae will be by default : public abstract
	void transact(int amount);
	
	/* error : We cannot create normal methods here :)
	void hello() {
		
	}*/
}

interface RazorPayGateway{
	void showDetails();
	void transact(int amount);
}

// MULTIPLE INHERITANCE : INTERFACE TO INTERFACE and not OBJECT TO OBJECT
interface Gateways extends PayTMGateway, RazorPayGateway{
	
}


// With classes we cannot to MULTIPLE extension				|	Inheritance      -> Parent Object and Child Object Relation
// BUT With interfaces we can do MULTIPLE implementation	|   Not Inheritance  -> Rule Book implemented by an Object
//class MyApp implements PayTMGateway, RazorPayGateway{
class MyApp implements Gateways{
	
	// Define all the methods which have to be implemented as per interfaces :)
	
	public void registerUser(String email, String phone) {
		System.out.println(">> User Registered with email "+email);
	}
	
	// Since, we had this RULE common in both interfaces we just need to define it once here 
	public void transact(int amount) {
		System.out.println(">> Amount Transacted Successfully: \u20b9"+amount);
	}
	
	public void showDetails() {
		System.out.println(">> Payment Options: Card/NetBanking/UPI");
	}
}

public class Interfaces {

	public static void main(String[] args) {
	
		/*
		PayTMGateway pRef = new MyApp();
		pRef.registerUser("john@example.com", "+91 99999 88888");
		pRef.transact(10000);
		//pRef.showDetails(); // error : Because PayTMGateway has no such RULE which we are executing :)

		System.out.println();
		
		RazorPayGateway rRef = new MyApp();
		rRef.showDetails();
		rRef.transact(3500);
		// rRef.registerUser("john@example.com", "+91 99999 88888"); // error : Because RazorPayGateway has no such RULE which we are executing :)
		*/
		
		Gateways gRef = new MyApp();
		gRef.showDetails();
		gRef.registerUser("john@example.com", "+91 99999 88888");
		gRef.transact(10000);
		
	}

}
