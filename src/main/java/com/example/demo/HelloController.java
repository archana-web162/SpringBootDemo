package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	User abcUser=new User("Archana", 24, "archana@gmail.com");

	/*
	 * @GetMapping("/") public String hello() { return "Hello World"; }
	 */
	@GetMapping("/test")
	public User getGreeting() {
		return abcUser;
	}
	
}
