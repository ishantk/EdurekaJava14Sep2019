package co.edureka.model;

public class FoodItem {
	
	// Attributes
	Integer fid;
	String name;
	Integer price;

	public FoodItem() {
	
	}

	public FoodItem(Integer fid, String name, Integer price) {
		this.fid = fid;
		this.name = name;
		this.price = price;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [fid=" + fid + ", name=" + name + ", price=" + price + "]";
	}
	
}
