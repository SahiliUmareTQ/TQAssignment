package com.demo;

import java.util.Scanner;

public class Divisible5n11 {

	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();

		if ((number % 5 == 0) && (number % 11 == 0)) {
			System.out.println("Divisible");
		} else {
			System.out.println("Not Divisible");
		}
	}

}
