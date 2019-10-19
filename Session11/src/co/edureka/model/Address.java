package co.edureka.model;

public class Address {

	Integer aid;
	String adrsLine;
	String city;
	String state;
	Integer zipCode;
	
	MyRestaurant restaurant; // HAS-A Relation | 1 to 1 | 1 Address Has 1 Restaurant
	
	
	public Address() {
	
	}


	public Address(Integer aid, String adrsLine, String city, String state, Integer zipCode, MyRestaurant restaurant) {
		this.aid = aid;
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.restaurant = restaurant;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	
	public MyRestaurant getRestaurant() {
		return restaurant;
	}



	public void setRestaurant(MyRestaurant restaurant) {
		this.restaurant = restaurant;
	}



	@Override
	public String toString() {
		return "Address [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}
	
}
