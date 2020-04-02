package com.infosys.flight.aspect;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AspectLogging {

	public AspectLogging() {
		// TODO Auto-generated constructor stub
		
	}
	@After("execution(* com.infosys.flight.repository.FlightRepositoryImpl.addFlightDetails(..))")
	public void logaddFlightDetails(JoinPoint joint) {
		System.out.println("Advice Join Point Signature "+joint.getSignature());
		Date now =new Date();
		System.out.println("Current Date "+now);
		
	}

	
}
