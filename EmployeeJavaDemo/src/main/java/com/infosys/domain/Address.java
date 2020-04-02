package com.infosys.domain;

/**
 * The Class Address.
 */
public class Address {

	/** The address deatils. */
	private String city;

	/** The state. */
	private String state;

	/** The pincode. */
	private int pincode;

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the stata.
	 *
	 * @param state
	 *            the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the pincode.
	 *
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}

	/**
	 * Sets the pincode.
	 *
	 * @param pincode
	 *            the new pincode
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	/**
	 * Instantiates a new address.
	 */
	public Address() {
		super();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	
	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

}
