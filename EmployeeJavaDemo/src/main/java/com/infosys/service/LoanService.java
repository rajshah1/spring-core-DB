package com.infosys.service;

import com.infosys.exception.ServiceException;

/**
 * The Interface LoanService.
 */
public interface LoanService {

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
}
