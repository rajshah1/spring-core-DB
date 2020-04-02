package com.infosys.repository;

import com.infosys.domain.Loan;


public interface LoanRepository {
	public Loan getLoan(int empId);
}
