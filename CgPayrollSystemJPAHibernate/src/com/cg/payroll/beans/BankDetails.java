package com.cg.payroll.beans;

import javax.persistence.Embeddable;

@Embeddable
public class BankDetails {
	
	private int accountNumber;
	private String bankName,ifscCode ;
	public BankDetails() {
		super();
	}
	
	
	
	public BankDetails(int accountNumber, String bankName, String ifscCode) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return  "\n accountNumber:"
				+ accountNumber + "\nbankName=" + bankName + "\n ifscCode="
				+ ifscCode ;
	}

}
