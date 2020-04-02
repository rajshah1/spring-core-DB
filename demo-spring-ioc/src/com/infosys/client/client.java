/**
 * 
 */
package com.infosys.client;

import com.infosys.services.reportService;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RAJ SHAH
 *
 */
public class client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		reportService Report = context.getBean(reportService.class);
		Report.reportcard();
		System.out.println(Report.getPages());
		context.close();
	}

}
