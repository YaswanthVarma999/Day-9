package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //controller and response
//      http://localhost:8080/api/hello
@RequestMapping("/ap")
public class HelloworldController {

	@GetMapping("/hello")
	public String sayHi() {
		return "this is our first basic spring boot demo";
		
	}
	
}
