package Package1;

import java.util.Scanner;

public class Subjectmarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sub1;
		float sub2;
		float sub3;
		float sub4;
		float sub5;
		float total, per;

		System.out.println("Enter sub1 marks");
		sub1 = sc.nextFloat();

		System.out.println("Enter sub2 marks");
		sub2 = sc.nextFloat();

		System.out.println("Enter sub3 marks");
		sub3 = sc.nextFloat();

		System.out.println("Enter sub4 marks");
		sub4 = sc.nextFloat();

		System.out.println("Enter sub5 marks");
		sub5 = sc.nextFloat();

		total = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println("Total marks :" + total);

		per = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
		System.out.println("percentage :" + per + "%");

		if (per >= 80) {
			System.out.println("outstanding");
		} else if (per >= 70) {
			System.out.println("very good");

		} else if (per >= 55) {
			System.out.println(" good");
		} else if (per >= 40) {
			System.out.println(" satisfactory");

		} else {
			System.out.println(" need to work hard");
		}
	}

}
