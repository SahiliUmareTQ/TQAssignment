package com.heirarchical;

public class Student {

	private int id;
	private String name;
	private int age;
	private int marks;
	private double fees;

	// default constructor
	Student() {

	}

	// para constructor
	Student(int id, String name, int age, int marks, double fees) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.fees = fees;
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

	public String getNmae() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getFees() {
		return fees;
	}

	// toString method

	public String toString() {
		return "Student Id:" + id + "Name:" + name + "Marks:" + marks + "Fees:" + fees;
	}

}
