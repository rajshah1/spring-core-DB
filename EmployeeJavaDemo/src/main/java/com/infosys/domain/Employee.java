package com.infosys.domain;

/**
 * The Class Employee.
 */

public class Employee {

	/** The emp id. */

	private int empId;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The role. */
	private String role;

	/** The department. */
	private String department;

	/** The address. */
	private Address address;

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address
	 *            the new address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role
	 *            the new role
	 */
	public void setRole(String role) {
		this.role = role;
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
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department.
	 *
	 * @param department
	 *            the new department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role
				+ ", department=" + department + ", address=" + address + "]";
	}

}