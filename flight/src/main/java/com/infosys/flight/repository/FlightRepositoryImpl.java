/**
 * 
 */
package com.infosys.flight.repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.infosys.flight.domain.Flight;

/**
 * @author RAJ SHAH
 *
 */
@Component()
public class FlightRepositoryImpl implements FlightRepository{

	/**
	 * 
	 */
	private int flightId=1000;
	
	private Map<String,Flight> flightRepo=new HashMap<>();
	
	
	public FlightRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addFlightDetails(Flight flight) {
		// TODO Auto-generated method stub
		flight.setFlightId(String.valueOf(++flightId));
		flightRepo.put(flight.getFlightId(),flight);
		for(String keys:flightRepo.keySet()) {
			System.out.println(keys);
		}
	}

	@Override
	public Flight searchFlightDeatils(Date journeydate) {
		// TODO Auto-generated method stub
		for (Flight savedetails:flightRepo.values()) {
			if(savedetails.getJourneyDate().compareTo(journeydate)==0) {
				return savedetails;
			};
		}
		return null;
	}

	}
