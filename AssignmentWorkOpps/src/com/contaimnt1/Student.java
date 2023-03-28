package com.contaimnt1;

import java.util.Scanner;

public class Student {

	private int rollno;
	private String name;

	Student() {
		System.out.println("Default constructor");
	}

	Student(int rollno, String name) {
		System.out.println("para constructor");
		this.rollno = rollno;
		this.name = name;
	}

	public void setRollNo(int rollno)

	{
		this.rollno = rollno;
	}

	public int getRollNo() {
		return rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "rollno" + " " + "name" + " ";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Department d = new Department();

		Student s = new Student(145, "neha");

		System.out.println("Enter student id");
		d.setId(sc.nextInt());

		System.out.println("Enter student name");
		d.setName(sc.next());

		System.out.println("-----------------------------------");

		System.out.println("Enter student rollno");
		s.setRollNo(sc.nextInt());

		System.out.println("Enter student name");
		s.setName(sc.next());

	}

}
