package com.exposurenew.app.newexposure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

@Configuration("first")
public class Employee1 implements Employee {

	@Override
	@Bean
	public void printing() {
		System.out.println("from first clas");
		
	}
	

}
