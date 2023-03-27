package com.klinnovations.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klinnovations.service.ReportService;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
	
	     ReportService service =  ctxt.getBean(ReportService.class); //target class
	      service.generateReport(); //target class
	
	}
	

}
