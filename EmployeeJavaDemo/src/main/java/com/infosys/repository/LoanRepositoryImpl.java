package com.infosys.repository;

import java.util.HashMap;
import java.util.Map;

import com.infosys.domain.Loan;



/**
 * The Class EmployeeRepositoryImpl.
 */
public class LoanRepositoryImpl implements LoanRepository {
	
	/** The count. */
	private static int count = 1;
	
	/** The loan map. */
	private static Map<Integer, Loan> loanMap = new HashMap<>();

	
	static {
		Loan loan1 = new Loan(101,1, 50000,2000,20,29000, "open");
		Loan loan2 = new Loan(102,2, 40000,1000,15,23000, "closed");
		loanMap.put(loan1.getEmpId(), loan1);
		loanMap.put(loan2.getEmpId(), loan2);
	}
	
	/* 
	 * method to insert employee details
	 */
	public static void save(Loan loan) {
		loan.setLoanId(count++);
		loanMap.put(loan.getEmpId(), loan);

	}

	@Override
	public Loan getLoan(int empId)  {
		return loanMap.get(empId);
	}

}
