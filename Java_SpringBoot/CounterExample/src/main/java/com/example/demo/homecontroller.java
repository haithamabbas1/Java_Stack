package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {
@RequestMapping("/")
public String home(){
	return "index.jsp";
}

@RequestMapping("/counter")
public String homez(HttpSession session) {
	Integer count = (Integer) session.getAttribute("count");
	if (count == null ) {
		session.setAttribute("count", 1);
		
	} else {
		count++;
		session.setAttribute("count", count);
	}
	return "home.jsp";
}
}
