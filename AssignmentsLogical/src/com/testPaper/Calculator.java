package com.testPaper;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int no1 = sc.nextInt();
		System.out.println("Enter second number");
		int no2 = sc.nextInt();
		System.out.println("Select symbol()+,-,*,/");
		String sym = sc.next();
		int result;

		switch (sym) {

		case "+":
			result = no1 + no2;
			System.out.println("Addition is:" + result);
			break;

		case "-":
			result = no1 - no2;
			System.out.println("Substraction is:" + result);
			break;

		case "*":
			result = no1 * no2;
			System.out.println("Multiplication is:" + result);
			break;

		case "/":
			result = no1 / no2;
			System.out.println("Division is:" + result);
			break;

		default:
			System.out.println("Invalid Result");

		}

		sc.close();
	}

}
