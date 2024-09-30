package com.example.demo.user;

import java.time.LocalDate;

public class User {
private int id;
private String name;
private String birthDate;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String birthDate) {
	super();
	this.id = id;
	this.name = name;
	this.birthDate = birthDate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBirthDate() {
	return birthDate;
}
public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
}

}
