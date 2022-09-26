package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/service2/hello")
	public String greet() {
		return " Greetings from Service-2! ";
	}

	@GetMapping("/hi")
	public String hi() {
		return " Hi ..!!";
	}


}
