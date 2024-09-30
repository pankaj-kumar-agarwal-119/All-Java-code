package com.example.demo.city;

public class City {
private int id;
private String cityName;
private int cityPopulation;
public City() {
	super();
	// TODO Auto-generated constructor stub
}
public City(int id, String cityName, int cityPopulation) {
	super();
	this.id = id;
	this.cityName = cityName;
	this.cityPopulation = cityPopulation;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public int getCityPopulation() {
	return cityPopulation;
}
public void setCityPopulation(int cityPopulation) {
	this.cityPopulation = cityPopulation;
}
@Override
public String toString() {
	return "City [id=" + id + ", cityName=" + cityName + ", cityPopulation=" + cityPopulation + "]";
}


}
