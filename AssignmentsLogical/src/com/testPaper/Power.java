package com.testPaper;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		int result = 1;

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter Power");
		int p = sc.nextInt();

		for (int i = 1; i <= p; i++) {
			result = p * result;
		}
		System.out.println("Power of any number :" + result);

		sc.close();
	}
}
