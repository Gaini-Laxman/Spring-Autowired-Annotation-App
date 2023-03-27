package com.klinnovations.bean;

import org.springframework.stereotype.Repository;

@Repository("OracleDao")
public class OracleReport implements ReportDao{
	public void getData() {
		System.out.println("Getting data from oracle db...");
		
	}
		
	}
	
	

