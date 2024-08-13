package com.iiht.security.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {

	@GetMapping("")
	public String greet() {
		return "Hello Master";
	}
	
	@GetMapping("/admin")
	public String greetA(){
		return "Hello Admin";
	}
	
	@GetMapping("/user")
	public String greetU(){
		return "Hello user";
	}
}
