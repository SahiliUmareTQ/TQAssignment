package com.containment;

public class Person {

	private String name;
	private String gender;
	private int age;
	private Address address;

	Person() {
		System.out.println("Default constructor");
	}

	Person(String name, String gender, int age, Address address) {
		System.out.println("person constructor");
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int Age() {
		return age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public String toString() {
		return "name: " + name + " gender " + gender + " age " + age + " address " + address;
	}

}
