package logicalPrograms;

public class Edigit {

	public static void main(String[] args) {

		int num = 123;
		int r;
		while (num != 0) {
			r = num % 10;
			System.out.println(r);
			num = num % 10;
			// System.out.println(num % 10);
		}
	}

}
