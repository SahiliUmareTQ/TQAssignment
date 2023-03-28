package com.SwitchOperator;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		String A = sc.next();

		switch (A) {
		case "A":
			System.out.println("A");
			break;

		case "B":
			System.out.println("B");
			break;

		case "C":
			System.out.println("C");
			break;

		case "D":
			System.out.println("D");
			break;

		default:
			System.out.println("Invalid output");

		}

	}

}
