package com.BasicsProgram;

import java.util.Scanner;

public class DaysinMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days");
		int days = sc.nextInt();

		int year = days / 365;
		System.out.println("years :" + year);

		days = days % 365;

		int week = days / 7;

		days = days % 7;

		System.out.println("weeks :" + week);

		System.out.println("days :" + days);

	}

}
