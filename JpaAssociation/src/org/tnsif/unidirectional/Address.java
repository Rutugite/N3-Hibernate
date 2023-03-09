package org.tnsif.unidirectional;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//program to demonstrate on one to one unidirectional association
@Entity
@Table(name="Address")
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//private data members
	private Integer pincode;
	private String area;
	private String City;
	private String state;
	
	//getters and setters
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", area=" + area + ", City=" + City + ", state=" + state + "]";
	}
	//default constructor
	public Address() {
		super();
	}
	
	//parameterized constructor
	public Address(Integer pincode, String area, String city, String state) {
		super();
		this.pincode = pincode;
		this.area = area;
		City = city;
		this.state = state;
	}
	
	
}
