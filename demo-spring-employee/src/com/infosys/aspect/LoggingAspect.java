package com.infosys.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.infosys.domain.Employee.get*(..))")
	public void LogGetEmp1() {
		System.out.println("In the get method");
	}
	
	@Before("execution(* com.infosys.repository.EmployeeGetDetailsImpl.find*(..))")
	public void LoggingAdvice1() {
		System.out.println("In Find");
	}
}
