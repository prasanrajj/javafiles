package com.i3.springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class HelloBean  implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("Hello Spring Boot!");
		
	}

}
