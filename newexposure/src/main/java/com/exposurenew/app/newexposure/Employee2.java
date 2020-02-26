package com.exposurenew.app.newexposure;

//import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Component;


@Component("second")
public class Employee2 implements Employee{

	@Override
	
	public void printing() {
		System.out.println("Second Class");
		
	}

}
