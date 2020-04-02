package com.infosys.client;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.infosys.domain.Address;
import com.infosys.domain.Employee;
import com.infosys.exception.ServiceException;
import com.infosys.service.EmployeeService;
import com.infosys.service.EmployeeServiceImpl;

/**
 * The Class EmployeeClient.
 */
public class EmployeeClient {

	static Logger logger=Logger.getLogger(EmployeeClient.class);


	/** The emp service. */
	EmployeeService empService = new EmployeeServiceImpl();

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		EmployeeClient client = new EmployeeClient();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while (choice!=4) {
			try {
				client.displayMenu();
				System.out.print("Enter your choice : ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					client.createEmployee(scanner);
					break;
				case 2:
					client.fetchEmployeeDetails(scanner);
					break;
				case 3:
					client.checkLoanEligibility(scanner);
					break;
				case 4:
					scanner.close();
					System.exit(1);
					break;
				default:
					System.out.println("Invalid choice!!, Please enter your choice again");
					break;
				}
			}  catch (Exception e) {
				logger.error(e.getMessage());
			}

		}

	}

	/**
	 * Display menu.
	 */
	private void displayMenu() {
		String line="********************************";
		System.out.println(line);
		System.out.println("*            M E N U           *");
		System.out.println(line);
		System.out.println("* 1. Add a new FlightDetails        *");
		System.out.println("* 2. View an Flight details  *");
		System.out.println("* 3. Exit                      *");
		System.out.println(line);
	}

	/**
	 * Check loan eligibility.
	 *
	 * @param sc
	 *            the sc
	 */
	private void checkLoanEligibility(Scanner sc) {
		System.out.println("Enter employeeId to get loan eligibility");
		int id = sc.nextInt();

		try {
			if (empService.isEligibleForLoan(id)) {
				System.out.println("You are eligible for the loan");
			} else {
				System.out.println("You are not eligible for loan ");
			}
		} catch (ServiceException e) {

			System.out.println(e.getMessage());
		}
	}

	
	/**
	 * Fetch employee details.
	 *
	 * @param sc
	 *            the sc
	 * @throws ServiceException
	 *             the service exception
	 */
	private void fetchEmployeeDetails(Scanner sc) throws ServiceException {

		System.out.println("Enter the employeeId");
		int id = sc.nextInt();

		Employee emp = empService.getEmployeeDetails(id);
		if (emp == null) {
			System.out.println("No records found");
		} else {
			System.out.println("Id  FirstName  LastName  Role  Department  Addressdetails ");
			System.out.println(emp.getEmpId() + " " + emp.getFirstName() + " " + emp.getLastName() + " " + emp.getRole()
					+ " " + emp.getDepartment() + " " + emp.getAddress().getCity() +""+ emp.getAddress().getState());

		}
	}

	
	/**
	 * Creates the employee.
	 *
	 * @param sc
	 *            the sc
	 * @throws SQLException
	 *             the SQL exception
	 * @throws ServiceException
	 *             the service exception
	 */
	private void createEmployee(Scanner sc) throws SQLException, ServiceException {
		Employee empDTO = new Employee();
		System.out.println("Enter Employee details\n");
		System.out.println("Enter Employee firstname:\n");
		String fname = sc.next();
		empDTO.setFirstName(fname);
		System.out.println("Enter Employee lastname:\n");
		String lname = sc.next();
		empDTO.setLastName(lname);
		System.out.println("Enter Employee role:\n");
		String role = sc.next();
		empDTO.setRole(role);
		System.out.println("Enter Employee department:\n");
		String dept = sc.next();
		empDTO.setDepartment(dept);
		Address addressDTO = new Address();
		System.out.println("Enter Employee city:\n");
		String city = sc.next();
		addressDTO.setCity(city);
		System.out.println("Enter state:\n");
		String state = sc.next();
		addressDTO.setState(state);
		System.out.println("Enter pincode:\n");
		int pincode = sc.nextInt();
		addressDTO.setPincode(pincode);
		empDTO.setAddress(addressDTO);
		empService.createEmployee(empDTO);
	}
}
