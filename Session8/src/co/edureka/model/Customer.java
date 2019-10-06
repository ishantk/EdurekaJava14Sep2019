package co.edureka.model;

// Structure of Customer Object: Model
public class Customer {

	// Attributes: Property of Object
	public int cid;
	public String name;
	public String phone;
	public String email;
	
	public Customer() {
	
	}

	public Customer(int cid, String name, String phone, String email) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}

/*
		--Object Relational Mapping--
		Customer Object can be mapped to Customer Table
		cid, name, phone and email are attributes of object -> they will become column names of table Customer
		
		1. Install Database either MySQL or Oracle
			Download from Google
			You can even use XAMPP which will provider a better UI to interact
			Make sure to remember username and passwords when you do installations
			
		2. In MySQL -> Create a DataBase
		3. In DataBase -> Create Tables
		
			// Java Code
			class Customer {
				 int cid;
				 String name;
				 String phone;
				 String email;
			}
			
			// SQL Command
			create table Customer(
				cid int primary key auto_increment,
				name varchar(256),
				phone varchar(16),
				email varchar(256)
			)
			
		4. In Table -> Insert, Update, Delete and Select Operations	
			// Java Code
			Customer cRef = new Customer(1, "John", "+91 99999 88888", "john@example.com");
			
			// SQL Command
			insert into Customer values(1, 'John', '+91 99999 88888', 'john@example.com')
			insert into Customer values(null, 'John', '+91 99999 88888', 'john@example.com')
			
			// Java Code
			cRef.name = "John Watson";
			cRef.email = "john.watson@example.com";
			 
			// SQL Command 
			 
			update Customer set name = 'John Watson', email = 'john.watson@example.com' where cid = 1
			
			delete from Customer where cid = 1
			
			select * from Customer (Fetch All Records i.e. Read All)
			select name, phone, form Customer (Fetch only 2 columns)
			select name from Customer where cid > 2
		
*/