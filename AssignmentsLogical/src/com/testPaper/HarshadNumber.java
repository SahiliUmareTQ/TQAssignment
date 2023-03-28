package com.testPaper;

import java.util.Scanner;

/*  Ex: input 18
    sum=1+8
    now 18 is completely divisible by 9 so its a Harshad no.*/

public class HarshadNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int c = n, d, sum = 0;
		while (c > 0) {
			d = c % 10; // 18%10=8 1%10=1
			sum = sum + d; // sum=0+8 9
			c = c / 10; // 8/10=1 ,1/10=0
		}
		if (n % sum == 0) {
			System.out.println("It is a Harshad Number :" + n);
		} else {
			System.out.println("It is not a Harshad Number :" + n);
		}

		sc.close();
	}

}
