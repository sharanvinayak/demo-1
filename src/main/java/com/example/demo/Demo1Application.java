package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
		 RestTemplate restTemplate = new RestTemplate();
		 
		 String ur="https://akg5w3ysk1.execute-api.us-east-2.amazonaws.com/testing/orderinformation?customerID=1";
		 System.out.println(restTemplate.getForObject(ur, String.class));
		 
		 	}
}
