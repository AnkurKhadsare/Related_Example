package com.cg.project.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int customerNo;
private String firstName,lastName,email;
@OneToOne//(mappedBy="customer")
private Car car;
public Customer() {}
public Customer(int customerNo, String firstName, String lastName,
		String email, Car car) {
	super();
	this.customerNo = customerNo;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.car = car;
}
public int getCustomerNo() {
	return customerNo;
}
public void setCustomerNo(int customerNo) {
	this.customerNo = customerNo;
}
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}




}
