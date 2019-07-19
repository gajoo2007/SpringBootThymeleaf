package com.thymeleafdemo.SpringBootThymeleaf;

import javax.validation.constraints.NotNull;

public class Employee {
	@NotNull
    String firstName;
	@NotNull
	String lastName;
	
	String department;
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}