package com.infosys.client;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.domain.Employee;
import com.infosys.service.EmployeeServiceImpl;

public class ClientLogic {

	public static void main(String []arg) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		EmployeeServiceImpl employeeService = (EmployeeServiceImpl) ctx.getBean("employeeService");

		Employee emp1 = new Employee(1037, "Bob", "Account");
		Employee emp2 = new Employee(1038, "Susan", "Testing");

		//employeeService.createEmployee(emp1);
		//employeeService.createEmployee(emp2);

		System.out.println("Records are successfully added..");

		List<Employee> ls = employeeService.selectAllEmployees();

		System.out.println(" **** Records in the Table ****");
		System.out.println(" Emp Id    Emp Name    Department");
		for (Employee list : ls) {
			System.out.println(list.getEmpId() + "\t" + list.getEmpName()
					+ "\t" + list.getDepartment());
		}

		System.out.println("Number of records in the Employee Table are "
				+ employeeService.getNumberOfEmployees());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid to be deleted ");
		int empId = sc.nextInt();
		int x = employeeService.deleteEmployee(empId);

		if (x > 0) {
			System.out.println(" Record Deleted ");
		} else {
			System.out.println(" Number of records found for the given empid are: ");
		}

		System.out.println("Enter the empid to be updated ");
		int empId1 = sc.nextInt();

		System.out.println("Enter the new department  ");
		String department = sc.next();
		int x1 = employeeService.updateEmployee(empId1, department);
		if (x1 > 0) {
			System.out.println(" Record Updated ");
		} else {
			System.out.println(" No records found for the empid given ");
		}
		System.out.println("Enter the empid to be fetched ");
		empId = sc.nextInt();
		System.out.println(employeeService.get(empId));
	   sc.close();
	   ctx.close();	
	   
	}
}
