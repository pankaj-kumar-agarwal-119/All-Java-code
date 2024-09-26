package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWorldController {
	
	@RequestMapping("/hello-world")
	public String hello() {
		return "Hello world";
	}
	
	@RequestMapping("/comapany-name")
    public String companyName() {
		return "Abc private limited";
	}
}
