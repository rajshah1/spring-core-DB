package com.infosys.client;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.infosys.domain.Employee;
import com.infosys.service.EmployeeService;

public class ClientLogic {
	public static void main(String []arg) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");

		// Create Employee instances
		Employee employee1 = new Employee(1022, "Alex", "Account");
		Employee employee2 = new Employee(1021, "Sam", "HR");

		// Invoking Service layer method to insert Employee details into
		// Employee table
		//employeeService.insertEmployee(employee1);
		//employeeService.insertEmployee(employee2);

		System.out.println("Records are successfully added..");

		System.out.println("Enter the empid to be deleted ");
		Scanner scanner = new Scanner(System.in);
		int empId = scanner.nextInt();

		// Invoking Service layer method to remove Employee details from
		// Employee table
		int result = employeeService.removeEmployee(empId);
		if (result > 0) {
			System.out.println(" Record deleted successfully ");
		} else {
			System.out.println(" No record found for the given empid ");
		}

		scanner.close();
		ctx.close();
	}

}
