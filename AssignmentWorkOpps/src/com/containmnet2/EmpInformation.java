package com.containmnet2;

import java.util.Scanner;

public class EmpInformation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Department d = new Department(1001, "civil");

		Employee e = new Employee(101, "sahili", "civil", 50000f, d);

		System.out.println(e);

		System.out.println("Enter name");
		e.setName(sc.next());

		System.out.println("Enter id");
		e.setId(sc.nextInt());

		System.out.println("Enter dept");
		e.setDept(sc.next());

		System.out.println(e);

		// MyDate m = new MyDate();

		// System.out.println("Enter emp id");
		// e.setId(sc.nextInt());

	}

}
