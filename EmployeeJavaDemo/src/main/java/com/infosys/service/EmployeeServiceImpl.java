package com.infosys.service;

import java.sql.SQLException;
import com.infosys.domain.Employee;
import com.infosys.exception.ServiceException;
import com.infosys.repository.EmployeeRepository;
import com.infosys.repository.EmployeeRepositoryImpl;

/**
 * The Class EmployeeServiceImpl.
 */


public class EmployeeServiceImpl implements EmployeeService {

	/** The employee repository. */

	private EmployeeRepository empRepo=new EmployeeRepositoryImpl();

	

	/** The loan service. */

	private LoanService loanService=new LoanServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.infosys.service.EmployeeService#insertEmployee(com.infosys.domain.
	 * Employee)
	 */
	public void createEmployee(Employee employee) throws SQLException, ServiceException {

		empRepo.save(employee);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.infosys.service.EmployeeService#getEmployeeDetails(int)
	 */
	public Employee getEmployeeDetails(int empId) throws ServiceException {
		return empRepo.getEmployeeDetails(empId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.infosys.service.EmployeeService#isEligibleforLoan(int)
	 */
	public boolean isEligibleForLoan(int empId) throws ServiceException {
		boolean ret = hasRoleEligibility(empId);
		if (ret) {
			ret = loanService.isEligibleForLoan(empId);
		}
		return ret;
	}

	/**
	 * Checks for role eligibility.
	 *
	 * @param empId
	 *            the emp id
	 * @return true, if successful
	 * @throws ServiceException
	 *             the service exception
	 */
	private boolean hasRoleEligibility(int empId) throws ServiceException {

		String role = null;
		boolean result = true;
		Employee employee = empRepo.getEmployeeDetails(empId);
		if (employee == null) {
			throw new ServiceException("No record found for the given employee details");
		} else {
			role = employee.getRole();
			if (role == null || role.equalsIgnoreCase("Manager") || role.equalsIgnoreCase("GM")) {
				result = false;
			} else {
				result = true;
			}
		}
		return result;
	}

	
}
