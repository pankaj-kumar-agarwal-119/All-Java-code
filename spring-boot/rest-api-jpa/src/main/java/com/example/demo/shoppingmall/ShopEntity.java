package com.example.demo.shoppingmall;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shops")
public class ShopEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String shopName;
	private int shopArea;
	private String shopManagerName;
	private int shopAvgPerDaySale;
	public ShopEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopEntity(int id, String shopName, int shopArea, String shopManagerName, int shopAvgPerDaySale) {
		super();
		this.id = id;
		this.shopName = shopName;
		this.shopArea = shopArea;
		this.shopManagerName = shopManagerName;
		this.shopAvgPerDaySale = shopAvgPerDaySale;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getShopArea() {
		return shopArea;
	}
	public void setShopArea(int shopArea) {
		this.shopArea = shopArea;
	}
	public String getShopManagerName() {
		return shopManagerName;
	}
	public void setShopManagerName(String shopManagerName) {
		this.shopManagerName = shopManagerName;
	}
	public int getShopAvgPerDaySale() {
		return shopAvgPerDaySale;
	}
	public void setShopAvgPerDaySale(int shopAvgPerDaySale) {
		this.shopAvgPerDaySale = shopAvgPerDaySale;
	}
	@Override
	public String toString() {
		return "ShopEntity [id=" + id + ", shopName=" + shopName + ", shopArea=" + shopArea + ", shopManagerName="
				+ shopManagerName + ", shopAvgPerDaySale=" + shopAvgPerDaySale + "]";
	}
	
}
