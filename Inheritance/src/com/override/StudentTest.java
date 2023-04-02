package com.override;

public class StudentTest {

	public static void main(String[] args) {

		SchoolStudent s1 = new SchoolStudent(101, "Suraj", 56f, 3000.0, "St Mary", 12);
		CollegeStudent c1 = new CollegeStudent(201, "Omkar", 67f, 8000.0, "MCA", 5);

		System.out.println(s1);
		System.out.println(c1);

		s1.calcFees(3000);
		c1.calcFees(8000);

		System.out.println(s1);
		System.out.println(c1);

	}

}
