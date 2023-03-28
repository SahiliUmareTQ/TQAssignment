package com.containment;

public class Address {

	private String city;
	private String state;
	private String country;

	Address() {
		System.out.println("Default constructor");
	}

	Address(String city, String state, String country) {
		System.out.println("Address constructor");
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public String toString() {
		return "city:  " + city + "  state  " + state + "  country  " + country;
	}

}
