package com.demo;

import java.util.Scanner;

public class ExtractDigit {

	public static void extract(int num) {
		System.out.println("The digits are");
		while (num != 0) {
			int r = num % 10;
			System.out.println(r);

			// System.out.println(num%10);
			num = num / 10;

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		extract(n);

	}

}
