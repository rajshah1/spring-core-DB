package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Employee;
import com.infosys.repository.EmployeeDAO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeDAO employeeDao ;
	

	public EmployeeDAO getEmployeeDao() {
		return employeeDao;
	}

	@Autowired
	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void createEmployee(Employee emp) {
		employeeDao.insert(emp);
	}

	public List<Employee> selectAllEmployees() {
		return employeeDao.getAll();
	}

	public int getNumberOfEmployees() {
	   return employeeDao.getCount();
	}

	public int deleteEmployee(int empId) {

		return employeeDao.delete(empId);
	}

	public int updateEmployee(int empId, String department) {
		 return employeeDao.update(empId, department);
	}

	@Override
	public Employee get(int empId) {
		return employeeDao.get(empId);
	}

	

}
