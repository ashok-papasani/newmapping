package com.exposurenew.app.newexposure;

import org.springframework.stereotype.Component;

@Component("first")
public class Employee1 implements Employee {

	@Override
	public void printing() {
		System.out.println("from first clas");
		
	}
	

}
