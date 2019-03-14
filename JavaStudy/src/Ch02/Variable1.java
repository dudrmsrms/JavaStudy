package Ch02;

public class Variable1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a의 값은? " + a);

		int b = 11;
		System.out.println("b의 값은? " + b);

		// a의 값에 b를 입력
		// 기존 a의 값읶 10은 사라짐   
		// 선언의 구조는  수학과 반대로 오른쪽 에서 왼쪽으로 흐른다. <-
		a = b;
		System.out.println("a의 값은? " + a);

	}
}
