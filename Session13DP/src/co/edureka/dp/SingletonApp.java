package co.edureka.dp;

/*
class Connection{
	
	public Connection() {
		System.out.println(">> Connection Object Constructed at "+this);
	}
	
}
*/


class Connection{
	
	// We created an Object in class and its reference variable is static (property of class)
	private static Connection con = new Connection();
	
	// User cannot create objects anymore
	private Connection() {
		System.out.println(">> Connection Object Constructed at "+this);
	}
	
	public static Connection getConnection() {
		return con;
	}
}

public class SingletonApp {

	public static void main(String[] args) {
		
		// Use Case : We want user to limit to have only 1 single connection object
		
		// We have created 3 connection Objects
		//Connection con1 = new Connection();
		//Connection con2 = new Connection();
		//Connection con3 = new Connection();
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		Connection con3 = Connection.getConnection();
		
		System.out.println(">> con1 is: "+con1);
		System.out.println(">> con2 is: "+con2);
		System.out.println(">> con3 is: "+con3);

	}

}
