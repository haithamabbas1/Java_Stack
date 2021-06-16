package com.haitham.gettingfamiliarwith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
@RequestMapping("/coding")
public class CodingController {

	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}
	@RequestMapping(value="", method = RequestMethod.GET)
	public String hello() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping(value="/python", method = RequestMethod.GET)
	public String hello2() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping(value="/java", method = RequestMethod.GET)
	public String hello3() {
		return "Java/Spring is better!";
	}

}