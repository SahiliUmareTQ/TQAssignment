package com.singleinheritance;

public class Person {

	private int id;
	protected String name;
	public int age;

	// Default constructor
	Person() {

	}

	// para constructor
	Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// getter setter
	public void display() {
		System.out.println("method1");
	}

	public void display1() {
		System.out.println("method2");
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNmae() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	// toString method

	public String toString() {
		return id + " " + name + " " + age;
	}

}
