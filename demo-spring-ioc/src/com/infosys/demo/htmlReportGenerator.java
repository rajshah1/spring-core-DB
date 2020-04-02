package com.infosys.demo;

import org.springframework.stereotype.Component;

@Component(value="htmlReportGenerator")
public class htmlReportGenerator implements reportGenerator {

	@Override
	public String reportcard(int page) {
		return "the page gien in HTML is " + page;
	}

}
