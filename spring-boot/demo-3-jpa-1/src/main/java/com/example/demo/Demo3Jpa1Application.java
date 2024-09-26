package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.userRepository;

@SpringBootApplication
public class Demo3Jpa1Application {

	public static void main(String[] args) {
	ApplicationContext context	= SpringApplication.run(Demo3Jpa1Application.class, args);
	 //start
	userRepository userRepo = context.getBean(userRepository.class);
	
	
	//end
	}

}
