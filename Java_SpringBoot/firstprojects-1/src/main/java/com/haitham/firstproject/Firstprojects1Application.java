package com.haitham.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Firstprojects1Application {

	public static void main(String[] args) {
		SpringApplication.run(Firstprojects1Application.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello Client how are you doing";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring boot is great! so easy to just respond with strings";
	}
}
