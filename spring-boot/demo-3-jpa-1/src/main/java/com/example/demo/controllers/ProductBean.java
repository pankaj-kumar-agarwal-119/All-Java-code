package com.example.demo.controllers;

public class ProductBean {
	private String product_name;

	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductBean(String product_name) {
		super();
		this.product_name = product_name;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	@Override
	public String toString() {
		return "ProductBean [product_name=" + product_name + "]";
	}
}
