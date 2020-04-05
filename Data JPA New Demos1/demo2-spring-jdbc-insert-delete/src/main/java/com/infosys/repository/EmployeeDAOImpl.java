package com.infosys.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infosys.domain.Employee;

@Repository(value = "employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// Method to insert record into Employee table
	public void insert(Employee emp) {
		String query = "INSERT INTO employee values(?,?,?)";
		jdbcTemplate.update(query,  emp.getEmpId(), emp.getEmpName(), emp.getDepartment() );
	}

	// Method to remove a record from Employee table
	public int delete(int empId) {
		return jdbcTemplate.update("delete from employee where EmpId  =?", empId);
	}
}
