package com.alphabetpattern;

public class Alphabet2 {

	public static void main(String[] args) {

		for (char ch = 'A'; ch <= 'E'; ch++) {
			for (char j = ch; j <= 'E'; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		System.out.println("=============");

		for (char ch = 'A'; ch <= 'E'; ch++) {
			for (char j = 'A'; j <= ch; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		System.out.println("=============================");
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

}
