package MethodPrimitive;

public class Diamond {
	public void diamond() {
		int[][] star = new int[9][9];
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star.length; j++) {
				if (i + j == 4 || i - j == 4 || i + j == 12 || j - i == 4) {
					System.out.print("¡Ú");
				} else {
					System.out.print("¡Ù");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Diamond di = new Diamond();
		di.diamond();
	}
}
