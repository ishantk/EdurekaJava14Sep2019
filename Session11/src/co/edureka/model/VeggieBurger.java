package co.edureka.model;

public class VeggieBurger extends Burger{

	String herbs;
	Integer spice; // 0 to 5
	
	public VeggieBurger() {
	
	}

	public VeggieBurger(String herbs, Integer spice) {
		this.herbs = herbs;
		this.spice = spice;
	}

	public String getHerbs() {
		return herbs;
	}

	public void setHerbs(String herbs) {
		this.herbs = herbs;
	}

	public Integer getSpice() {
		return spice;
	}

	public void setSpice(Integer spice) {
		this.spice = spice;
	}

	@Override
	public String toString() {
		return "VeggieBurger [herbs=" + herbs + ", spice=" + spice + ", burgerName=" + burgerName + ", dressing="
				+ dressing + ", fid=" + fid + ", name=" + name + ", price=" + price + "]";
	}
	
}
