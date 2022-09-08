package com.pillReminder.pillReminder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
	
	
	
//	@GetMapping("/")
//	public String home() {
//		return "registration";
//		
//	}
	@GetMapping("/first")
	public String first() {
		return "first";
	}
}