/**
 * 
 */
package com.infosys.flight.repository;

import java.util.Date;

import com.infosys.flight.domain.Flight;

/**
 * @author RAJ SHAH
 *
 */
public interface FlightRepository {
	public void addFlightDetails(Flight flight);
	 public Flight searchFlightDeatils(Date journeydate);
}
