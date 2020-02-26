package com.exposurenew.app.newexposure;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class Montroller {
   @Autowired
   @Qualifier("second")
   Employee employee;
	@Autowired
	BeanClass bean;
	
	@PostMapping("/values")
	public Details addMemberV1(@RequestBody Details member) {
		
	
		bean.printn();
		employee.printing();
		return member;
        
    }
 
	
}
