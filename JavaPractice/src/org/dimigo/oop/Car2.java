package org.dimigo.oop;

public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice){
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed){
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
	}
	
	public Car2(String newCompany, String newModel, String newColor){
		company = newCompany;
		model = newModel;
		color = newColor;
	}
	
	public Car2(String newCompany, String newModel){
		company = newCompany;
		model = newModel;
	}
	
	
	public Car2(String newCompany){
		company = newCompany;
	}
	
	public Car2(){
	}
	
	
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public int getPrice(){
		return price;
	}

	/*
	public void setCompany(String newCompany){
		company = newCompany;
	}
	
	public void setModel(String newModel){
		model = newModel;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		maxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}
	*/
	
}
