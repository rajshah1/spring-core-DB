package com.infosys.repository;

import java.util.HashMap;
import java.util.Map;

import com.infosys.domain.Employee;


/**
 * The Class EmployeeRepositoryImpl.
 */
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	/** The count. */
	private int count = 1;
		
	/** The employee map. */
	private static Map<Integer, Employee> employeeMap = new HashMap<>();

	/* 
	 * method to retrieve employee details based on employee id
	 */
	public Employee getEmployeeDetails(int id) {

		return employeeMap.get(id);
	}

	/* 
	 * method to insert employee details
	 */
	public void save(Employee emp) {
		emp.setEmpId(count++);
		employeeMap.put(emp.getEmpId(), emp);

	}

}
