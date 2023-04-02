package Package1;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabets");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.println(ch + " ");
				ch++;
			}
			System.out.println();
		}
		sc.close();

	}

}
