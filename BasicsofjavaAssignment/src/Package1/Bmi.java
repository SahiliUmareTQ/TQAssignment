package Package1;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Height");
		float height = sc.nextFloat();

		System.out.println("Enter the Weight");
		float weight = sc.nextFloat();

		height = height * 0.3048f;
		float bmi = weight / (height * height);

		System.out.println("your bmi is :" + bmi);

	}

}
