/**
 * 
 */
package com.infosys.flight.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.infosys.flight.domain.Flight;
import com.infosys.flight.repository.FlightRepository;

/**
 * @author RAJ SHAH
 *
 */
@Service
public class FlightServiceImpl implements FlightService{

	/**
	 * 
	 */
	public FlightServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	@Qualifier("flightRepositoryImpl")
	public FlightRepository master;

	@Override
	public void createFlightDetails(Flight flightDetails) {
		// TODO Auto-generated method stub
		master.addFlightDetails(flightDetails);
	}


	@Override
	public Flight getFlightDetails(Date journeyDate) {
		return master.searchFlightDeatils(journeyDate);
	}

}
