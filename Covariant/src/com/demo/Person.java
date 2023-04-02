package com.demo;

abstract public class Person {

	private String name;
	private int age;
	static int pcount = 0;
	{
		pcount++;
	}

	// constructor
	Person() {

	}

	Person(int age, String name) {
		this.age = age;
		this.name = name;

	}

	// abstract method
	abstract void CheckStatus();

	abstract void MoneyStatus();

	// static method
	static void diaplaypersonCount() {
		System.out.println("Number of person:" + pcount);
	}

	// getter setter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	// toString
	public String toString() {
		return "Person name=" + name + ", age=" + age + "";
	}

}
