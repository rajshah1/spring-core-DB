package com.infosys.domain;

public class Employee {
	private int empId;
	private String empName;
	private String department;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + "]";
	}

}
