package com.emsi;

public class Car {
	
	private String id;
	private String randomBrand;
	private String randomColor;
	private int price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Car(String id, String randomBrand, String randomColor, int price) {
		super();
		this.id = id;
		this.randomBrand = randomBrand;
		this.randomColor = randomColor;
		this.price = price;
	}

	public String getRandomBrand() {
		return randomBrand;
	}

	public void setRandomBrand(String randomBrand) {
		this.randomBrand = randomBrand;
	}

	public String getRandomColor() {
		return randomColor;
	}

	public void setRandomColor(String randomColor) {
		this.randomColor = randomColor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
