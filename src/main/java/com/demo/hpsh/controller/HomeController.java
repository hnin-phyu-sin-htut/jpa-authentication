package com.demo.hpsh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String hello() {
		return "Welcome to Home.";
	}
	
	@GetMapping("/user")
	public String helloUser() {
		return "Welcome!";
	}
	
	@GetMapping("/admin")
	public String helloAdmin() {
		return "Welcome admin!";
	}

}
