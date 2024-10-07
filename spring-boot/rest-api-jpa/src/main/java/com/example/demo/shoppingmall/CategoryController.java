package com.example.demo.shoppingmall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getAllRecords(){
		return categoryService.getAllRecord();
	}
	
	@GetMapping("/category/{id}")
	public Optional<Category> getRecordById(@PathVariable int id){
		return categoryService.getRecordById(id);
	}
	
	@PostMapping("/categories")
	public Category saveRecord(@RequestBody Category rawObj) {
		System.out.println("The category save request is : "+rawObj);
		return categoryService.saveRecord(rawObj);
	}
}
