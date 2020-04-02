package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.infosys.domain.Employee;
import com.infosys.repository.EmployeeGetDetailsImpl;
import com.infosys.repository.EmployeeImp;
//import com.infosys.repository.EmployeeImp;
@Service("EmpAccessService")
public class empAccessService {
	@Autowired(required = false)
	@Qualifier("employeeGetDetailsImpl")
	public EmployeeImp master;
	
	//public Integer empId;

	   public Employee findEmployee(int empId){
		  // System.out.println(empId);
		   return master.getEmployeeDetails(empId);      
    }
	
	
}
