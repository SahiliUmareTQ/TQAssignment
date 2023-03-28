package com.demo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		int ans;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("Enter an operator (+, -, *, /): ");
		op = sc.next().charAt(0);
		switch (op) {
		case '+':
			ans = num1 + num2;
			break;
		case '-':
			ans = num1 - num2;
			break;
		case '*':
			ans = num1 * num2;
			break;
		case '/':
			ans = num1 / num2;
			break;
		default:
			System.out.printf("Invalid operator");
		}

	}

}
