/**
 * 
 */
package com.infosys.flight.service;

import java.util.Date;

import com.infosys.flight.domain.Flight;

/**
 * @author RAJ SHAH
 *
 */
public interface FlightService {
	public void createFlightDetails(Flight flightDetails);
	public Flight getFlightDetails(Date journeyDate);

}
