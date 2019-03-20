package Ch06;

public class MethodExam1 {
	public static void main(String[] args) {
		printStar(5, '¡Ú');
		printStar(10,'¤·');
	}

	public static void printStar(int count, char ch) {
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}

