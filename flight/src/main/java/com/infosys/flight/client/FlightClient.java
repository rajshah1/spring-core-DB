
package com.infosys.flight.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.flight.domain.Flight;
import com.infosys.flight.service.FlightServiceImpl;


public class FlightClient {

	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Appconfig.xml");
	 FlightServiceImpl FlightImp = context.getBean(FlightServiceImpl.class);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date a=new Date();
		FlightClient flightClient=new FlightClient();
		 int choice=0;
		Scanner scanner = new Scanner(System.in);
		while(choice!=3 ) {	
		try{
				flightClient.displayMenu();
				System.out.print("Enter your choice : ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					flightClient.addFlight(scanner);
					break;
				case 2:
					flightClient.fetchFlightDetails(scanner);
					break;
				case 3:
					scanner.close();
					System.exit(1);
					break;
				default:
					System.out.println("Invalid choice!!, Please enter your choice again");
					break;
				}
			}  catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
//		tempFlight.setDestination("USA");
//		tempFlight.setFare(10000.0);
//		tempFlight.setJourneyDate(a);
//		tempFlight.setAirlines("Air India");
//		tempFlight.setSeatCount(200);
//	context.close();
		}
		private void displayMenu() {
			System.out.println("\n***********Menu ***********\n");
			System.out.println("1. Add Flight Details:");
			System.out.println("2. Search Flight Details:");
			System.out.println("3. Exit ");
			System.out.println("\n---------------------------\n");
		}
		public void addFlight(Scanner scanner) throws ParseException {
			Flight tempFlight=new Flight();
			
			System.out.println("Enter the Flight Source: ");
			tempFlight.setSource(scanner.next());
			System.out.println("Enter the Flight destination: ");
			tempFlight.setDestination(scanner.next());
			System.out.println("Enter the Flight Arlines Name: ");
			tempFlight.setAirlines(scanner.next());
			System.out.println("Enter the Flight Fair: ");
			tempFlight.setFare(scanner.nextDouble());
			System.out.println("Enter the Flight Seat Count: ");
			tempFlight.setSeatCount(scanner.nextInt());
			System.out.println("Enter the Flight journey date in format dd/mm/yyyy : ");
		    String str = scanner.next();
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(str);
		   // System.out.println(date1);
			tempFlight.setJourneyDate(date1);
			FlightImp.createFlightDetails(tempFlight);
			//System.out.println(tempFlight);
		
		}
	
	private void fetchFlightDetails(Scanner scanner) throws ParseException {
		System.out.println("Enter the Search category---(JourneyDate) ");
		String str = scanner.next();
	    Date journeyDate=new SimpleDateFormat("dd/MM/yyyy").parse(str);
	    if(FlightImp.getFlightDetails(journeyDate)!=null) {
	    	System.out.println("Flight Details for given JourneyDate");
	    	Calendar cal=Calendar.getInstance();
	    	cal.setTime(journeyDate);
	    	
	    	if(cal.get(Calendar.MONTH)==11 || cal.get(Calendar.MONTH)==0) {
	    		FlightImp.getFlightDetails(journeyDate).setFare(FlightImp.getFlightDetails(journeyDate).getFare()*1.2);
	    	}
	    	System.out.println(FlightImp.getFlightDetails(journeyDate));
	    	
	    }
	    else {
	    System.out.println("THEIR IS NO JOURNEY DETAILS");	
	    }
		
	
	}

}
