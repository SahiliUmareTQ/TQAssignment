package logicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int originalNumber, remainder, result = 0, n = 0;

		originalNumber = number;

		// count number of digits
		while (originalNumber != 0) {
			originalNumber /= 10;
			++n;
		}

		originalNumber = number;

		// calculate sum of nth power of each digit
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
			originalNumber /= 10;
		}

		// check if number is Armstrong
		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}
}
