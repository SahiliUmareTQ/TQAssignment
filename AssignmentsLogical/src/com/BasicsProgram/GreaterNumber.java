package com.BasicsProgram;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if ((num % 2) == 0) {
			System.out.println("The even no is :" + num);
		} else {
			System.out.println("The odd no is :" + num);
		}

		System.out.println();

		System.out.println("Enter the Age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("The person can able to do voting :" + age);
		} else {
			System.out.println("The person can not able to do voting:" + age);
		}

	}

}
