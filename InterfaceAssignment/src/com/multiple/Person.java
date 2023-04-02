package com.multiple;

public class Person implements teacher, student {

	private int id;
	private String name;

	public Person() {

	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// getter setter

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// toString

	public String toString() {
		return "Person :" + id + " " + name;
	}

	@Override
	public void show() {
		System.out.println(id + " " + name);

	}

	public static void main(String[] args) {

		Person p1 = new Person(1000, "sahili");
		p1.show();

	}

}
