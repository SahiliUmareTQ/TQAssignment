package com.demo;

abstract public class Employeee extends Person {

	protected float salary;
	private String job;

	Employeee() {

	}

	Employeee(String name, int age, float salary, String job) {
		super(age, name);
		this.salary = salary;
		this.job = job;
	}

	void MoneyStatus() {
		System.out.println("I am working person");
		System.out.println("Job:" + job);
		System.out.println("Salary:" + salary);

	}

	void CheckStatus() {
		System.out.println("I have earned:");
		this.salary = this.salary + salary;

	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public String toString() {
		return "Employee [" + super.toString() + " salary=" + salary + ", job=" + job + "]";
	}

}
