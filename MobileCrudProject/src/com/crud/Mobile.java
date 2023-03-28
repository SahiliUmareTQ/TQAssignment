package com.crud;

public class Mobile {

	private int id;
	private String brand;
	private float price;
	private String name;

	public Mobile() {

	}

	public Mobile(int id, String brand, float price, String name) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + ", name=" + name + "]";
	}

}
