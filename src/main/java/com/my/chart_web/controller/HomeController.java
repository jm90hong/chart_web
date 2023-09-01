package com.my.chart_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("sb")
	public String sb() {
		
		return "stack-bar";
	}
}
