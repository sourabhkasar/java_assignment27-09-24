package patternprinting;

public class Pattern23 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == j))
					System.out.print("0 ");

				else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
}
