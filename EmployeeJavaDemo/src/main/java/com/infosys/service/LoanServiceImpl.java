package com.infosys.service;


import com.infosys.domain.Loan;
import com.infosys.exception.ServiceException;
import com.infosys.repository.LoanRepository;
import com.infosys.repository.LoanRepositoryImpl;

/**
 * The Class LoanServiceImpl.
 */

public class LoanServiceImpl implements LoanService {

	/** The loan repository. */

	LoanRepository loanRepository=new LoanRepositoryImpl();

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.infosys.service.LoanService#isEligibleForLoan(int)
	 */
	public boolean isEligibleForLoan(int empId) throws ServiceException  {
		Loan loan = loanRepository.getLoan(empId);
		boolean flag=false;
		if((loan == null) || (!(loan.getStatus().equalsIgnoreCase("open")))){
			flag= true;			
		}

			return flag;
	}
}
