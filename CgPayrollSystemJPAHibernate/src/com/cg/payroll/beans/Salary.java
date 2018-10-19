package com.cg.payroll.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Salary {
	private int basicSalary,hra,conveyenceAllowance;
	private int otherAllowance,personalAllowance,monthlyTax ,epf;
	private int companyPf, gratuity ,grossSalary ,netSalary ;
	public Salary() {
		super();
	}
	public Salary(int basicSalary, int hra, int conveyenceAllowance,
			int otherAllowance, int personalAllowance, int monthlyTax, int epf,
			int companyPf, int gratuity, int grossSalary, int netSalary) {
		super();
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.conveyenceAllowance = conveyenceAllowance;
		this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.gratuity = gratuity;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
	}

	public Salary(int basicSalary, int conveyenceAllowance, int epf,
			int companyPf, int gratuity) {
		super();
		this.basicSalary = basicSalary;
		this.conveyenceAllowance = conveyenceAllowance;
		this.epf = epf;
		this.companyPf = companyPf;
		this.gratuity = gratuity;

	}
	
	public Salary(int basicSalary, int epf, int companyPf) {
		super();
		this.basicSalary = basicSalary;
		this.epf = epf;
		this.companyPf = companyPf;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getConveyenceAllowance() {
		return conveyenceAllowance;
	}
	public void setConveyenceAllowance(int conveyenceAllowance) {
		this.conveyenceAllowance = conveyenceAllowance;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getPersonalAllowance() {
		return personalAllowance;
	}
	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}
	public int getMonthlyTax() {
		return monthlyTax;
	}
	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	public int getEpf() {
		return epf;
	}
	public void setEpf(int epf) {
		this.epf = epf;
	}
	public int getCompanyPf() {
		return companyPf;
	}
	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}
	public int getGratuity() {
		return gratuity;
	}
	public void setGratuity(int gratuity) {
		this.gratuity = gratuity;
	}
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	@Override
	public String toString() {
		return "\nSalary: \nbasicSalary=" + basicSalary + "\nhra=" + hra
				+ "\nconveyenceAllowance=" + conveyenceAllowance
				+ " \notherAllowance=" + otherAllowance + "\n personalAllowance="
				+ personalAllowance + ", monthlyTax=" + monthlyTax + ", epf="
				+ epf + "\n companyPf=" + companyPf + "\ngratuity=" + gratuity
				+ " \ngrossSalary=" + grossSalary + "\nnetSalary=" + netSalary;
	}
	
}
