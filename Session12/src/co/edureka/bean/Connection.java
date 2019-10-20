package co.edureka.bean;

// Spring FW -> Bean (Object or Model)
public class Connection {
	
	// Attributes : Property of Object
	String url;
	String username;
	String password;
	
	public Connection() {
		System.out.println(">> Connection Object Constructed with Default Constructor");
	}

	public Connection(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
		System.out.println(">> Connection Object Constructed with Parameterized Constructor");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", username=" + username + ", password=" + password + ", HashCode: "+super.toString()+"]";
	}
	
	// names can be any names of your choice for init and destroy method
	public void myInit() {
		System.out.println(">> myInit for Bean Executed");
	}
	
	public void myDestroy() {
		System.out.println(">> myDestroy for Bean Executed");
	}

}
