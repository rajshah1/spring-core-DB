/**
 * 
 */
package com.infosys.services;

import com.infosys.demo.reportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author RAJ SHAH
 *
 */
@Service("ReportService")
public class reportService {

	/**
	 * 
	 */
	@Value("150")
	public int pages;
	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	
	public reportGenerator getMaster() {
		return master;
	}

	public void setMaster(reportGenerator master) {
		this.master = master;
	}
	@Autowired
	@Qualifier("PdfReportGenerator")
	public reportGenerator master;

	// constructor
	public reportService(int pages, reportGenerator master) {
		this.pages = pages;
		this.master = master;
	}

	// Method to override
	public void reportcard() {
		System.out.println(master.reportcard(pages));
	}

	public reportService() {
		//System.out.println("Hello");
		// TODO Auto-generated constructor stub
	}

}
