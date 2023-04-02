package Package1;

public class Frequency {

	public static void main(String[] args) {
		int n, count;
		int num = 2563;
		for (int i = 0; i <= 10; i++) {
			n = num;
			count = 0;
			while (n != 0) {
				if (i == (n % 10))
					count++;
				n = n / 10;
			}
			if (count > 0) {
				System.out.println(i + ":" + count);
			}
		}

	}

}
