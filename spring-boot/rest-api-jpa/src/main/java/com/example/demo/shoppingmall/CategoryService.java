package com.example.demo.shoppingmall;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoryService {
	@Autowired
 private CategoryRepository categoryRepository;
	
	public List<Category> getAllRecord() {
		return categoryRepository.findAll();
	}
	
	public Optional<Category> getRecordById(int id) {
		return categoryRepository.findById(id);
	}
	
	public Category saveRecord(Category category) {
		return categoryRepository.save(category);
	}
}
