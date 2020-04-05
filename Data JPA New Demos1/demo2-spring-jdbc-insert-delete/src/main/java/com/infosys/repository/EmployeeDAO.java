package com.infosys.repository;

import com.infosys.domain.Employee;

public interface EmployeeDAO {

	// Method to insert Employee record into Employee table
	public void insert(Employee employee);

	// Method to remove a record from Employee table
	public int delete(int empId);

}
