package co.edureka.model;

import java.util.List;

// Model or Bean or POJO (Plain Old Java Object)

public class YourRestaurant {

	// Attributes : Property of Object
	Integer rid;
	String name;
	String type;
	Integer ratings;
	String openingTime;
	
	List<FoodItem> items; // 1 to many | 1 Restaurant can have many food items
	
	public YourRestaurant() {
	
	}

	public YourRestaurant(Integer rid, String name, String type, Integer ratings, String openingTime,
			List<FoodItem> items) {
		this.rid = rid;
		this.name = name;
		this.type = type;
		this.ratings = ratings;
		this.openingTime = openingTime;
		this.items = items;
	}


	public List<FoodItem> getItems() {
		return items;
	}

	public void setItems(List<FoodItem> items) {
		this.items = items;
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
