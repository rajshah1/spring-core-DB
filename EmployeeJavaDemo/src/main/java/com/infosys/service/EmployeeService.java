package com.infosys.service;

import java.sql.SQLException;
import com.infosys.domain.Employee;
import com.infosys.exception.ServiceException;

/**
 * The Interface EmployeeService.
 */
public interface EmployeeService {

	/**
	 * Insert employee.
	 *
	 * @param employee
	 *            the employee
	 * @throws SQLException
	 *             the SQL exception
	 * @throws ServiceException
	 *             the service exception
	 */
	// Method to access data access layer method to insert Employee record
	public void createEmployee(Employee employee) throws SQLException, ServiceException;

	/**
	 * Checks if is eligible for loan.
	 *
	 * @param empId
	 *            the emp id
	 * @return true, if is eligible for loan
	 * @throws ServiceException
	 *             the service exception
	 */
	public boolean isEligibleForLoan(int empId) throws ServiceException;

	/**
	 * Gets the employee details.
	 *
	 * @param empId
	 *            the emp id
	 * @return the employee details
	 * @throws ServiceException
	 *             the service exception
	 */
	public Employee getEmployeeDetails(int empId) throws ServiceException;

	

}
