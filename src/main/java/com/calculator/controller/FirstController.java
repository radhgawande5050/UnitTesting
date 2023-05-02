package com.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FirstController {
	@GetMapping("/Greeting")
	public String welcome() {
		return "Greeting";
		
	}

}
