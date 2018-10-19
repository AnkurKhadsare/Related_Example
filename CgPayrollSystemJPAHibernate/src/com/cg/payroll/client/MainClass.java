package com.cg.payroll.client;

import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;




public class MainClass {

	public static void main(String[] args) throws PayrollServicesDownException, AssociateDetailsNotFoundException {
		
		PayrollServices payrollServices = new PayrollServicesImpl();
		
		//Create Record 
		
		int associateID=payrollServices.acceptAssociateDetails("Ankur", "Khadsare", "ankur@gmail.com", "YTP", "Sr.analyst", "ABC1234X", 20000, 17300, 1000, 1000, 5336355, "KOTAK", "KKT0012");
		System.out.println("Given Associate Id is: "+associateID);
		int associateID2=payrollServices.acceptAssociateDetails("Ankur", "Khadsare", "ankur@gmail.com", "YTP", "Sr.analyst", "ABC1234X", 20000, 17300, 1000, 1000, 5336355, "KOTAK", "KKT0012");
		
		System.out.println("Given Associate Id is: "+associateID2);
		// Calculate Net Salary--------------------------------------------------------------------------
			/*	System.out.println(associateID);
				int netsal=payrollServices.calculateNetSalary(associateID);
				System.out.println("Net Salary:  "+netsal);*/
		
		
	}

}
