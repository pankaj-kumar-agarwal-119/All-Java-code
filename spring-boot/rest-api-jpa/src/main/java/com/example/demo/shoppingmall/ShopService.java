package com.example.demo.shoppingmall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ShopService {
	
	@Autowired
	ShopRepository shopRepository;
	
	public List<ShopEntity> getAllRecords(){
		return shopRepository.findAll();
	}
	
	public Optional<ShopEntity> getRecord(int id) {
		return shopRepository.findById(id);
	}
	
	public ShopEntity saveRecord(ShopEntity rawObj) {
		return shopRepository.save(rawObj);
	}
	
	public ShopEntity updateRecord(int id,ShopEntity updatedRecord) {
		Optional<ShopEntity> optionObj = shopRepository.findById(id);
		ShopEntity findRecord = optionObj.get();
		//now set with new obj
		findRecord.setShopName(updatedRecord.getShopName());
		findRecord.setShopArea(updatedRecord.getShopArea());
		findRecord.setShopManagerName(updatedRecord.getShopManagerName());
		findRecord.setShopAvgPerDaySale(updatedRecord.getShopAvgPerDaySale());
		return shopRepository.save(findRecord);
	}
	
	public void deleteRecord(int id) {
		 shopRepository.deleteById(id);
	}

}
