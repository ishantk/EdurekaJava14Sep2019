package co.edureka.bean;

public class Pizza extends FoodItem{ // IS-A
	
	int size;
	String description;

	public Pizza() {
	
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", description=" + description + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
