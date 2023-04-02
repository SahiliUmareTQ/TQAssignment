package com.demo;

class Emp {

	float salary;

	Emp incSalary() {
		salary = salary + 1000;
		return this;
	}

}

class Manager extends Emp {
	Manager incSalary() {
		salary = salary + 5000;
		return this;
	}

	void perks() {
		salary = salary + 2000;
	}

}

public class CovariantDemo1 {

	public static void main(String[] args) {

		Emp e = new Emp();
		e.salary = 3000;

		e = e.incSalary();
		System.out.println(e.salary);

		////////////////////////////////////

		Manager m = new Manager();
		m.salary = 8000;

		m = m.incSalary();
		System.out.println(m.salary);

		m.perks();
		System.out.println(m.salary);

		m.perks();
		System.out.println(m.salary);

	}

}
