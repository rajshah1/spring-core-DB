package com.infosys.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.infosys.domain.Employee;

@Repository(value = "employeedao")
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbctemplate;
 
	@Autowired
	public void setDataSourse(DataSource ds) {
		this.jdbctemplate = new JdbcTemplate(ds);
	}

	public void insert(Employee emp) {
		String query = "INSERT INTO Employee Values (?,?,?)";
		jdbctemplate.update(
				query,
				 emp.getEmpId(), emp.getEmpName(),
						emp.getDepartment() );
	}

	public List<Employee> getAll() {
		String sql = "select * from employee";
		return jdbctemplate.query(sql, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNum)
					throws SQLException {
		//		System.out.println(r);
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("EmpId  "));
				emp.setEmpName(rs.getString("EmpName"));
				emp.setDepartment(rs.getString(3));
					return emp;
			}
		});
	}
	public Employee get(int empId) {
		String sql = "select * from employee where EmpId  =?";
		return jdbctemplate.queryForObject(sql, new Object[]{empId}, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNum)throws SQLException {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setDepartment(rs.getString(3));
			return emp;
			}});
		}
	public int getCount() {
		String sql = "Select count(*) from Employee" ;
		return jdbctemplate.queryForObject(sql, Integer.class);
	}

	public int delete(int empid) {
		return jdbctemplate.update("delete from employee where EmpId  =?",
				empid);
	}

	public int update(int empid, String department) {
		String query = "update employee set `Department `=? where `EmpId  `=?";
		return jdbctemplate.update(query, department, empid);
	}

	
}
