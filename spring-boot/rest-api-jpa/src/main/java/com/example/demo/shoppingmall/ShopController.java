package com.example.demo.shoppingmall;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ShopController {
	
	@Autowired
	ShopService shopService;
	
	@GetMapping("/shops")
	public List<ShopEntity> getAllRecords(){
		return shopService.getAllRecords();
	}
	
	@GetMapping("/shops/{id}")
	public Optional<ShopEntity> getRecord(@PathVariable int id) {
		return shopService.getRecord(id);
	}
	
	@PostMapping("/shops")
	public ShopEntity saveRecord(@RequestBody ShopEntity rawObj) {
		return shopService.saveRecord(rawObj);
	}
	
	@PutMapping("/shops/{id}")
	public ShopEntity updateRecord(@PathVariable int id, @RequestBody ShopEntity rawObj) {
		return shopService.updateRecord(id, rawObj);
	}
	
	@DeleteMapping("/shops/{id}")
	public void deleteRecord(@PathVariable int id) {
		 shopService.deleteRecord(id);
	}

}
