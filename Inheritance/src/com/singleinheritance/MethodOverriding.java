package com.singleinheritance;

class Emp {

	public void incrementSalary() {

		System.out.println("Employee salary method");
	}

}

class Managerr extends Emp {
	void icrementSalary() {

	}

	// override method
	public void incrementSalary() {
		System.out.println("Manager salary method");

	}

}

public class MethodOverriding {

	public static void main(String[] args) {

		Emp e1 = new Emp();
		e1.incrementSalary();

		Managerr m1 = new Managerr();
		m1.incrementSalary();

	}

}
