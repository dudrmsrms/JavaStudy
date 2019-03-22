package Ch06;

public class MethodExam1 {
	public static void main(String[] args) {
		
		printStar(5, '★');
		printStar(10,'ㅇ');
	}
	//method 메모리 영역에 등록
	static int a = 100;
	int b = 200;

	public static void printStar(int count, char ch) {
		System.out.println(a);
		MethodExam1 m = new MethodExam1();
		System.out.println(m.b);
		// 차이점

		
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}

