package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorDemoApplication.class, args);
	
	}
	public String getmsgFirst() {
		return "welcome";
		
	}
	public String getmsgSecond() {
		return "welcomeHome";
		
	}

}
