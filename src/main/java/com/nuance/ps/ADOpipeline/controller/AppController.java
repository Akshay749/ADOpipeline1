package com.nuance.ps.ADOpipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	@GetMapping("/Greeting")
	public String Greeting() {
		
		return "Greetings from Nuance";
	}

}
