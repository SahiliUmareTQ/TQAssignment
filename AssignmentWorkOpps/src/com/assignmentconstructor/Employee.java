package com.assignmentconstructor;

public class Employee {

	private int id;
	private String name;
	private float salary;

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee id:" + id + ", name:" + name + ", salary:" + salary + "";
	}

}
