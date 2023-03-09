package org.tnsif.joinedinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Citizen")

public class Citizen extends Student{
	private String CitizenType;
	private Integer PassportNo;
	
	//getters and setters
	
	public String getCitizenType() {
		return CitizenType;
	}
	public void setCitizenType(String citizenType) {
		CitizenType = citizenType;
	}
	public Integer getPassportNo() {
		return PassportNo;
	}
	public void setPassportNo(Integer passportNo) {
		PassportNo = passportNo;
	}
	@Override
	public String toString() {
		return "Citizen [CitizenType=" + CitizenType + ", PassportNo=" + PassportNo + "]";
	}
	
	
	

	}


