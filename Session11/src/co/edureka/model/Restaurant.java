package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Model or Bean or POJO (Plain Old Java Object)
@Entity
@Table(name = "MY_RESTAURANTS")
public class Restaurant {

	// Attributes : Property of Object
	@Id
	@GeneratedValue
	@Column(name = "RID")
	Integer rid;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "TYPE")
	String type;
	
	@Column(name = "RATINGS")
	Integer ratings;
	
	@Column(name = "OPENINGTIME")
	String openingTime;
	
	public Restaurant() {
	
	}

	public Restaurant(Integer rid, String name, String type, Integer ratings, String openingTime) {
		this.rid = rid;
		this.name = name;
		this.type = type;
		this.ratings = ratings;
		this.openingTime = openingTime;
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
