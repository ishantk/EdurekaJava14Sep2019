package co.edureka;

import co.edureka.DataBaseAccessObject.DataBaseHelper;

class DataBaseAccessObject{ // Outer Class
	
	void insert() {
		System.out.println(">> insert data in database");
	}
	
	// Modularization :) | Readability and Maintanability becomes more easier
	class DataBaseHelper{ // Inner Class or Nested Class
		void create() {
			System.out.println(">> Create Database and Tables in MySQL");
		}
	}
	
}

public class Nested {

	public static void main(String[] args) {

		DataBaseAccessObject dao = new DataBaseAccessObject();
		DataBaseHelper helper = dao.new DataBaseHelper();
		
		helper.create(); 
		dao.insert();
		
	}

}
