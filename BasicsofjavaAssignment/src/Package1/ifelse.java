package Package1;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int num1 = sc.nextInt();

		System.out.println("Enter second no");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("num1 is greater");
		} else {
			System.out.println("num2 is greater");
		}

	}

}
