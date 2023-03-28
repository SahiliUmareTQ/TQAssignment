package com.containment;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Address a = new Address("Hinganghat", "maharashtra", "India");

		Person p = new Person("sahili", "female", 25, a);
		System.out.println(p);

		System.out.println("Enter name");
		p.setName(sc.next());

		System.out.println("Enter gender");
		p.setGender(sc.next());

		System.out.println("Enter age");
		p.setAge(sc.nextInt());

		System.out.println(p);

	}

}