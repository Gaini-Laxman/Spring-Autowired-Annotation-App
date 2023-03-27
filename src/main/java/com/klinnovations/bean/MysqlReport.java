package com.klinnovations.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("MysqlDao")
@Primary  //priority
public class MysqlReport implements ReportDao{

	public void getData() {

		System.out.println("Getting Data from Mysql db...");
		
	}
	}

