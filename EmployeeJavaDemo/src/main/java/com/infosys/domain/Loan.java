package com.infosys.domain;

/**
 * The Class Loan.
 */

public class Loan {

	/** The loan id. */
	private int loanId;

	/** The emp id. */
	private int empId;

	/** The amount. */
	private double amount;

	/** The emi. */
	private double emi;

	/** The no of insatllment. */
	private int noOfInsatllment;

	/** The balance. */
	private double balance;

	/** The status. */
	private String status;

	

	public Loan(int loanId, int empId, double amount, double emi, int noOfInsatllment, double balance, String status) {
		super();
		this.loanId = loanId;
		this.empId = empId;
		this.amount = amount;
		this.emi = emi;
		this.noOfInsatllment = noOfInsatllment;
		this.balance = balance;
		this.status = status;
	}

	/**
	 * Gets the loan id.
	 *
	 * @return the loan id
	 */
	public int getLoanId() {
		return loanId;
	}

	/**
	 * Sets the loan id.
	 *
	 * @param loanId
	 *            the new loan id
	 */
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	/**
	 * Gets the emp id.
	 *
	 * @return the emp id
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * Sets the emp id.
	 *
	 * @param empId
	 *            the new emp id
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount
	 *            the new amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * Gets the emi.
	 *
	 * @return the emi
	 */
	public double getEmi() {
		return emi;
	}

	/**
	 * Sets the emi.
	 *
	 * @param emi
	 *            the new emi
	 */
	public void setEmi(double emi) {
		this.emi = emi;
	}

	/**
	 * Gets the no of insatllment.
	 *
	 * @return the no of insatllment
	 */

	public int getNoOfInsatllment() {
		return noOfInsatllment;
	}

	/**
	 * Sets the no of insatllment.
	 *
	 * @param noOfInsatllment
	 *            the new no of insatllment
	 */

	public void setNoOfInsatllment(int noOfInsatllment) {
		this.noOfInsatllment = noOfInsatllment;
	}

	/**
	 * Gets the balance.
	 *
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets the balance.
	 *
	 * @param balance
	 *            the new balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", empId=" + empId + ", amount=" + amount + ", emi=" + emi
				+ ", noOfInsatllment=" + noOfInsatllment + ", balance=" + balance + ", status=" + status + "]";
	}

}
