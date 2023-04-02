package com.demo2;

public class Manager implements Employee {

	private int id;
	private String name;
	private float salary;

	Manager() {

	}

	Manager(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

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

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	// toString method

	public String toString() {
		return "Manager :" + id + " " + name + " " + salary;
	}

	@Override
	public void showDetails() {

		System.out.println(id + " " + name + " " + salary);

	}

	@Override
	public void showSalary(float perks) {

		salary = salary + perks;
		System.out.println("salary :" + salary);

	}

}
