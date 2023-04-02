package com.singleinheritance;

public class Employee {

	private int id;
	private String name;
	private float salary;

	// default constructor
	Employee() {

	}

	// para constructor
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void incrementSalary() {
		System.out.println("Salary method");
	}

	// getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	// toString method
	public String toString() {
		System.out.println("In Employee toString");
		return id + " " + name + " " + salary;
	}

}
