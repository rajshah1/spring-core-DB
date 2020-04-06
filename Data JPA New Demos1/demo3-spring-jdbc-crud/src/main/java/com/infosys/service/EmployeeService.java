package com.infosys.service;

import java.util.List;

import com.infosys.domain.Employee;

public interface EmployeeService {
	
	public void createEmployee(Employee emp);

	public List<Employee> selectAllEmployees();

	public int getNumberOfEmployees();

	public int deleteEmployee(int empId);

	public int updateEmployee(int empId, String department);
	public Employee get(int empId);
}
