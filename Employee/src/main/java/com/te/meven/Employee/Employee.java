package com.te.meven.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_info")
public class Employee {
	@Id
	private int employeeID;
	private int employeeSal;
	private String employeeName;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(int employeeSal) {
		this.employeeSal = employeeSal;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}
