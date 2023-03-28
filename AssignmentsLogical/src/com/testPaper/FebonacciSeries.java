package com.testPaper;

public class FebonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;
		int num = 0;

		for (int i = 1; i <= 10; i++) {

			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			if (num % 5 == 0) {

				continue;
			}
			System.out.println(num);

		}

	}

}
