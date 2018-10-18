package com.cg.project.client;

import com.cg.project.beans.Associate;
import com.cg.project.daoservices.AssociateDAO;
import com.cg.project.daoservices.AssociateDAOImpl;

public class MainClass {

	public static void main(String[] args) {
		
		AssociateDAO dao=new AssociateDAOImpl();
		
		/*Associate associate=new Associate("Ankur", "Khadsare", "ankur@gmail,com", "Sr.Con");
		
		dao.save(associate);
		
		Associate associate1=new Associate("Somnath", "Dey", "som@gmail,com", "Sr.Con");
		
		dao.save(associate1);
		
		System.out.println(dao.findAll());*/
		
	}

}
