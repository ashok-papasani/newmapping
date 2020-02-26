package com.exposurenew.app.newexposure;

import javax.annotation.PostConstruct;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

@Component
public class BeanClass {
	BeanClass()
	{
		System.out.println("Bean Constructor");	
	}
	
	
	
@PostConstruct
public void printjf() {
	System.out.println("Post Construct");
}

void printn()
{
	  System.out.println("Bean Method");
}
	

   /*void print()
  {
	  System.out.println("Method but not a bean");
  }*/
	

}
