package com.BasicsProgram;

import java.util.Scanner;

public class BmiCalculate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ht.");
		float Height = sc.nextFloat();

		System.out.println("Enter Wt.");
		float Weight = sc.nextFloat();

		Height = Height * 0.3048f;

		float bmi = Weight / (Height * Height);

		System.out.println("Your BMI is :" + bmi);

		if (bmi < 18) {
			System.out.println("Under wt.");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else {
			System.out.println("Overweight");
		}
	}

}
