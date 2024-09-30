package com.example.demo.todo;

import jakarta.persistence.Table;

@jakarta.persistence.Entity
public class Entity {
@Id
@Table(name="todos")
private int id;
private String title;
private String description;
private boolean status;
public Entity() {
	super();
	// TODO Auto-generated constructor stub
}
public Entity(int id, String title, String description, boolean status) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.status = status;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
@Override
public String toString() {
	return "Entity [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status + "]";
}

}
