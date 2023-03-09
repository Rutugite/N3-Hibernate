package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="Manager_Store")
@Entity

public class Manager extends Employee{
	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	
	private Integer depid;
	private String deptname;
	//getters and setters
	public Integer getDepid() {
		return depid;
	}
	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Manager [depid=" + depid + ", deptname=" + deptname + "]";
	}
	

}
