package co.edureka.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {
	
	// Attributes
	String name;
	String phone;
	String address;
	
	// Dependency
	// If we wish to create Restaurant Object, we must have FoodItem Object
	FoodItem item;					// HAS-A Relationship [1 to 1]
	
	//List<String> departments; 	// HAS-A Relationship [1 to many]
	
	public Restaurant() {
		System.out.println(">> Restaurant Object Consructed with Default Constructor");
		//item = new FoodItem(); 
		// Not Recommended | Construction of FoodItem Object will be highly dependent on Restaurant Object Construction
		// HIGH COUPLING
	}
	
	//@Autowired
	public Restaurant(FoodItem item) {
		System.out.println(">> Restaurant Object Consructed with Paremeterized Constructor");
		System.out.println(">> CONSTRUCTOR INJECTION");
		this.item = item; 
		// Recommended | Construction of FoodItem Object is now not dependent on Restaurant Object Construction
		// We are just passing the reference of FoodItem Object and Linking the dependency
		// LOW COUPLING
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public FoodItem getItem() {
		return item;
	}

	// We can even pass the Object Reference for FoodItem later in setter method to link dependency
	@Autowired
	public void setItem(FoodItem item) {
		System.out.println(">> SETTER INJECTION");
		this.item = item;
	}
	
	/*
	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	*/

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", address=" + address + ", item=" + item + "]";
	}
	

}
