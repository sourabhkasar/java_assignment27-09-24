package patternprinting;

public class Pattern20 {
	public static void main(String[] args) {
		int n = 5;
		int k = n;
		for (int i = 1; i <= n; i++, k--) {
			for (int j = 1; j <= n; j++) {
				if ((i == j || k == j))
					System.out.print("X ");
				else {
					System.out.print("O ");
				}
			}

			System.out.println();
		}
	}
}
