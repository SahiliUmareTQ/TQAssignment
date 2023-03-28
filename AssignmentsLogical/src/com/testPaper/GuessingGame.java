package com.testPaper;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int randmNumber = ran.nextInt(10);
		System.out.println(randmNumber);

		while (true) {
			System.out.println(" Welcome to the game! Please enter your guess (1-10):");
			int guess = sc.nextInt();

			if (guess == randmNumber) {
				System.out.println("Correct!!! You win ;)  ");
				break;

			} else if (guess < randmNumber) {
				System.out.println("Nopeee Please guess higher number ");

			} else {
				System.out.println("Nopeee. Please guess lower number ");

			}

			sc.close();

		}

	}

}
