package com.infosys.repository;

import java.util.List;

import com.infosys.domain.Employee;

public interface EmployeeDAO {
	public void insert(Employee emp);

	public List<Employee> getAll();

	public int getCount();

	public int delete(int empId);

	public int update(int empId, String department);
	public Employee get(int empId);
}
