
public class RightAngleTriangel {

	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("------------------");

		int n = 1;
		for (int i = 0; i <= 2; i++) {

			for (int j = 0; j <= 2; j++) {
				System.out.print((n) + " ");
				n++;
			}
			System.out.println();
		}

	}

}
