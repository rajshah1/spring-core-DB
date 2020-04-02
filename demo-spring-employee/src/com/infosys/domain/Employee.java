package com.infosys.domain;

public class Employee {

	
	public int empId;
	public String empName;
	public String empDepartment;
	
	//Parameterized Constructor 
	public Employee(int empId,String empName,String empDepartment) {
		this.empId=empId;
		this.empName=empName;
		this.empDepartment=empDepartment;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
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
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	@Override
	public String toString() {
		
	return this.empDepartment+"\n"+this.empName+"\n"+this.empId;
		
	}

}

