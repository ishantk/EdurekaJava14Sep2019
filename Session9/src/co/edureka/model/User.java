package co.edureka.model;

// Represents Structure of User Object
public class User {
	
	// Attributes: Property of Object
	public int uid;
	public String name;
	public String email;
	public String password;
	
	public User() {
	
	}

	public User(int uid, String name, String email, String password) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}



}
