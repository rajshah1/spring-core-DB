package com.infosys.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.infosys.domain.Employee;
@Repository 

public  class EmployeeGetDetailsImpl implements EmployeeImp{
	public static  Map<Integer,Employee> empMap =new  HashMap<>();
	static {
		Employee one =new Employee();
		Employee two =new Employee();
		Employee three =new Employee();
		
		one.setEmpId(1000);
		one.setEmpName("Raj shah");
		one.setEmpDepartment("I.T");
		
		two.setEmpId(1001);
		two.setEmpName("Pranav shah");
		two.setEmpDepartment("Finacial");
		
		three.setEmpId(1002);
		three.setEmpName("Heena shah");
		three.setEmpDepartment("Data");
		
		empMap.put(one.getEmpId(), one);
		empMap.put(two.getEmpId(), two);
		empMap.put(three.getEmpId(), three);
	
		one.getEmpDepartment();
		//System.out.println(empMap.get(1002).toString() );
	
	}
	
	@Override
	public Employee getEmployeeDetails(int empId) {
		//System.out.println(empMap.get(empId));
		
		return empMap.get(empId);
		}

}
