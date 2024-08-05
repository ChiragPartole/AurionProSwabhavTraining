package com.techlabs.structural.composite.test;

import com.techlabs.structural.composite.model.CompanyDirectory;
import com.techlabs.structural.composite.model.Developer;
import com.techlabs.structural.composite.model.Manager;

public class Test {
	 public static void main(String[] args) {
	        Developer dev1 = new Developer(1, "John", "senior Developer");
	        Developer dev2 = new Developer(2, "Jane", "junior Developer");
	        
	        Manager man1 = new Manager(10, "Mike", "Manager");
	        Manager man2 = new Manager(11, "Emily", "Product Manager");

	        CompanyDirectory engDirectory = new CompanyDirectory();
	        CompanyDirectory managementDirectory = new CompanyDirectory();

	        engDirectory.addEmployee(dev1);
	        engDirectory.addEmployee(dev2);

	        managementDirectory.addEmployee(man1);
	        managementDirectory.addEmployee(man2);

	        CompanyDirectory companyDirectory = new CompanyDirectory();
	        companyDirectory.addEmployee(engDirectory);
	        companyDirectory.addEmployee(managementDirectory);

	        companyDirectory.showEmployeeDetails();
	    }
	}
