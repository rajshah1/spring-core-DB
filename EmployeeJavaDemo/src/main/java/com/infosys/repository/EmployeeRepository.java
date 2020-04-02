package com.infosys.repository;


import com.infosys.domain.Employee;


/**
 * The Interface EmployeeRepository.
 */
public interface EmployeeRepository {

	/**
	 * Save.
	 *
	 * @param employee
	 *            the employee
	 * @throws ServiceException
	 *             the service exception
	
	 */
	public void save(Employee employee) ;

	/**
	 * Gets the employee details.
	 *
	 * @param empId
	 *            the emp id
	 * @return the employee details
	 * @throws ServiceException
	 *             the service exception
	 */
	public Employee getEmployeeDetails(int empId);

	
}
