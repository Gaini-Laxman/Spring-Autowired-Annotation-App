package com.klinnovations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klinnovations.bean.ReportDao;

@Service
public class ReportService {

	// @Autowired // if field level put here or constructor level put above of the
	// constructor
	// @Qualifier("OracleDao") // by name

	public ReportDao dao; // DI by using field injection

	/*
	 * @Autowired
	 * 
	 * @Qualifier("OracleDao") public void setDao(ReportDao dao) { // setter DI
	 * System.out.println("setter method called.."); this.dao = dao; }
	 */
	public ReportService() {
		System.out.println("0-param constructor "); // when using two constructor mandatory for @autowired if one
													// constructor there is optional for autowired
	}
     @Autowired
	public ReportService(ReportDao dao) { // DI by using constructor injection
		System.out.println("param constructor ");
		this.dao = dao;

	}

	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated...");
	}

}
