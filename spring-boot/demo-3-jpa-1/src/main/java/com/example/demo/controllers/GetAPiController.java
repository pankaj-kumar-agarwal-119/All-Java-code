package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAPiController {
	//Instead of @RequestMapping , we are  using the @GetMapping annotation
	@GetMapping(path = "/helloi")
	public String getHello() {
		return "Hello world !";
	}
	
	@GetMapping(path = "/api/products/{name}/{attributeId}")
	public String getProductName(@PathVariable String name,@PathVariable String attributeId) {
		return "Hello "+name+" , attributeId";
		}
	
	@GetMapping("/get-product-obj")
	public ProductBean getProductDetail() {
		return new ProductBean("iphone");
	}
	
	@GetMapping("/get-product-obj-dynamic/{name}")
	public ProductBean getProductDetail(@PathVariable String name) {
		return new ProductBean(name);
	}
}
