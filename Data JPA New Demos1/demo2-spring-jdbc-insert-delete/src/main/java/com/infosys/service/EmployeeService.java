package com.infosys.service;

import com.infosys.domain.Employee;

public interface EmployeeService {

	// Method to access data access layer method to insert Employee record
	public void insertEmployee(Employee employee);

	// Method to access data access layer method to remove a record
	public int removeEmployee(int empId);
}
