package com.infosys.client;
/**
 * 
 */


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.infosys.service.empAccessService;


/**
 * @author RAJ SHAH
 *
 */
public class empClient {

	/**
	 * 
	 */
	public empClient() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		empAccessService employeeI = (empAccessService)context.getBean(empAccessService.class);
		System.out.println(employeeI.findEmployee(1002).getEmpId());
		context.close();

	}

}
