package org.tnsif.tableperclass;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Emp_store")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

//program to demonstrate on TablePerClass Inheritance
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	
	//data members
	@javax.persistence.Id
	private Integer Id;
	private String name;
	private float salary;
	
	//getters and setters
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
