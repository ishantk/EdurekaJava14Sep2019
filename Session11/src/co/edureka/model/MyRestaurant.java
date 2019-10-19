package co.edureka.model;

// Model or Bean or POJO (Plain Old Java Object)

public class MyRestaurant {

	// Attributes : Property of Object
	Integer rid;
	String name;
	String type;
	Integer ratings;
	String openingTime;
	
	Address address; // HAS-A Relationship :) 1 to 1 relationship  | 1 Restaurant Has 1 Address
	
	public MyRestaurant() {
	
	}

	public MyRestaurant(Integer rid, String name, String type, Integer ratings, String openingTime, Address address) {
		this.rid = rid;
		this.name = name;
		this.type = type;
		this.ratings = ratings;
		this.openingTime = openingTime;
		this.address = address;
	}


	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getRatings() {
		return ratings;
	}

	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}

	public String getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	@Override
	public String toString() {
		return "Restaurant [rid=" + rid + ", name=" + name + ", type=" + type + ", ratings=" + ratings
				+ ", openingTime=" + openingTime + "]";
	}
	
}
