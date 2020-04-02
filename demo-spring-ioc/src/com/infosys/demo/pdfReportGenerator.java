package com.infosys.demo;

import org.springframework.stereotype.Component;

@Component(value="PdfReportGenerator")
public class pdfReportGenerator implements reportGenerator {

	@Override
	public String reportcard(int page) {
		return "the page gien in PDF is " + page;
	}

}
