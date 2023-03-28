package com.BasicsProgram;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int side;
		float area;

		System.out.println("Enter the length of the side of square:");

		side = sc.nextInt();

		area = side * side;

		System.out.println("Area of square is :" + area);

	}

}
