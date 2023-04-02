package com.singleinheritance;

public class Manager extends Employee {

	private int exp;

	// default constructor
	Manager() {

	}

	// para constructor
	Manager(int id, String name, float salary, int exp) {
		super(id, name, salary);
		System.out.println("In Manager constr");
		this.exp = exp;
	}

	@Override
	void incrementSalary() {
		System.out.println("Salary method");
	}

	// getter setter
	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getExp() {
		return exp;
	}

	// toString method
	public String toString() {
		return super.toString() + " " + exp;
	}

}
