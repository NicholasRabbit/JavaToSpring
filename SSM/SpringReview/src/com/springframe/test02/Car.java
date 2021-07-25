package com.springframe.test02;

public class Car {
	private String brand;
	private String make;
	private Double litre;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Double getLitre() {
		return litre;
	}
	public void setLitre(Double litre) {
		this.litre = litre;
	}
	public Car() {
	
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", litre=" + litre + "]";
	}
	
	
}
