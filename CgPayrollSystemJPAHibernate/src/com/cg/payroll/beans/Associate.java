package com.cg.payroll.beans;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Associate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int associateID;
	private int yearlyInvestementUnder8oC ;
	private String firstName , lastName , department,designation,pancard,emailId ;
	@Embedded
	private BankDetails bankdetails;
	@Embedded
	private Salary salary;

 

	public Associate() {}

	

	public Associate(int yearlyInvestementUnder8oC, String firstName,
			String lastName) {
		super();
		this.yearlyInvestementUnder8oC = yearlyInvestementUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public Associate(int associateID, int yearlyInvestementUnder8oC,
			String firstName, String lastName, String department,
			String designation, String pancard, String emailId,
			BankDetails bankdetails, Salary salary) {
		super();
		this.associateID = associateID;
		this.yearlyInvestementUnder8oC = yearlyInvestementUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.bankdetails = bankdetails;
		this.salary = salary;
	}



	public Associate(int yearlyInvestementUnder8oC, String firstName,
			String lastName, String department, String designation,
			String pancard, String emailId, BankDetails bankdetails,
			Salary salary) {
		super();
		this.yearlyInvestementUnder8oC = yearlyInvestementUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.bankdetails = bankdetails;
		this.salary = salary;
	}



	public int getAssociateID() {
		return associateID;
	}



	public void setAssociateID(int associateID) {
		this.associateID = associateID;
	}



	public int getYearlyInvestementUnder8oC() {
		return yearlyInvestementUnder8oC;
	}



	public void setYearlyInvestementUnder8oC(int yearlyInvestementUnder8oC) {
		this.yearlyInvestementUnder8oC = yearlyInvestementUnder8oC;
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



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getPancard() {
		return pancard;
	}



	public void setPancard(String pancard) {
		this.pancard = pancard;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public BankDetails getBankdetails() {
		return bankdetails;
	}



	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}



	public Salary getSalary() {
		return salary;
	}



	public void setSalary(Salary salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Associate: associateID=" + associateID
				+ "\nyearlyInvestementUnder8oC=" + yearlyInvestementUnder8oC
				+ "\n firstName=" + firstName + "\n lastName=" + lastName
				+ "\ndepartment=" + department + "\n designation=" + designation
				+ "\npancard=" + pancard + "\n emailId=" + emailId
				+ " \nbankdetails=" + bankdetails + "\n salary=" + salary ;
	}



	

}
