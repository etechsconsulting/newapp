package com.example.newapp;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class NewappApplication {


	@RequestMapping("/")
	String home() {
		return "Hello DevOps is good";
	}

	public static void main(String[] args) {
		SpringApplication.run(NewappApplication.class, args);
	}

}
