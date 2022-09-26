package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${service2.url}")
    String service2Url;

    @GetMapping("/service1/hello")
    public String greet() {
        String h1 = " Greetings from Service-1! ";
		String h2 = restTemplate.getForEntity(service2Url, String.class).getBody();
		return h1 + " + " + h2 ;
    }

    @GetMapping("/hi")
    public String hi() {
       return " Hi ..!!";
    }

}
