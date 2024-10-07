package com.example.demo.shoppingmall;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity // 1 (Used to mark any class as Entity)
@Table(name="categories") //2
public class Category {
    @Id // 3 (Used to mark column as primary key)
    @GeneratedValue(strategy = GenerationType.AUTO) //4
    @Column(name="category_id") // Can be used to specify column mapping. To change the column name , specifying length etc
	private int id;
    @Column(name="category_name")
	private String categoryName;
    @Column(name="category_desc")
	private String categoryDesc;
    
    @Transient //(used as a field to be ignored)
    private String x;
    
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int id, String categoryName, String categoryDesc) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", categoryDesc=" + categoryDesc + ", x=" + x
				+ "]";
	}
	
	
	
}
