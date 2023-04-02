package com.dynamicbinding;

class Person {
	protected void display() {
		System.out.println("I am a person");
	}

}

class Employee extends Person {

	public void display() {
		System.out.println("I am a employee");
	}

}

class Celebrity extends Person {
	public void display() {
		System.out.println("I am a celebrity");
	}

}

public class DynamicMehod {

	public static void main(String[] args) {

		Person p;
		p = new Employee();
		p.display();

		p = new Celebrity();
		p.display();

	}
}