package com.singleinheritance;

public class TechManager {

	public static void main(String[] args) {

		Manager m1 = new Manager(1, "sahili", 60000f, 5);
		System.out.println(m1);

		Employee e1 = new Employee(2, "Neha", 50000f);
		System.out.println(e1);

		e1.incrementSalary();

	}

}
