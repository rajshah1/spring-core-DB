package com.infosys.aspect;

import java.text.DateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("Aspect")
public class aspect {

	public aspect() {
		// TODO Auto-generated constructor stub
	}
	@Before("execution(* com.infosys.services.reportService.get*(..))")
	public void LoggingAdvice(){
	System.out.println("In get method");	
	 // System.out.println("In Advice, Joinpoint signature :" + joinPoint.getSignature());
      long time = System.currentTimeMillis();
      
//Log details such as time stamp of report generated
System.out.println("Report generated at time:" + DateFormat.getDateTimeInstance().format(time));
	}

	 
	
	
}
