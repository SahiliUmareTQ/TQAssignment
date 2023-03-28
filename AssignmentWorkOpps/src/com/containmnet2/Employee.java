package com.containmnet2;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private float salary;
	private Department department;

	Employee() {

	}

	Employee(int id, String name, String dept, float salry, Department department) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.department = department;
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

	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public String toString() {
		return " id :" + id + " name :" + name + " dept: " + dept + " salary :" + salary + " department :" + department;
	}
}
