package com.demo;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter a number");
		num = sc.nextInt();

		if (num > 0)
			System.out.println(num + " is positive number.");
		else if (num < 0)
			System.out.println(num + " is negative number.");
		else
			System.out.println(num + " is a ZERO.");
	}

}
