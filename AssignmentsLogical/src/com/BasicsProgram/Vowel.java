package com.BasicsProgram;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		char ch;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the Aplphabet");

		ch = keyboard.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Alphabet is Vowel");

		} else {
			System.out.println("Alphabet is consonant");
		}

	}

}
