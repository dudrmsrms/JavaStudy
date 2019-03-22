package Ch07;

public class Exam7_3 {
	public static void main(String[] args) {
		/* Class7_3의 method1( ) 호출 */
		Class7_3.method1();
	}
}

class Class7_3 {
	int a;

	public static void method1() {
		System.out.println("method1 실행 시작");
		/* ?? */
		// static 이(가) 없을시 method를 만들때 저장공간인 class 를 new 시켜주고 나서  
		// method가 소환 가능해진다. 이것을 위한 class 7_3 new 소환
		
		Class7_3 c = new Class7_3();
		for (int i = 0; i < 5; i++) {
			
			c.method2();
			/* method2를 호출할 수 있도록 코드 작성 */
			
		}
		
		System.out.println("method1 실행 종료");
		
	}

	public void method2() {
		 a++;
		System.out.println(a);
		/* 전역변수 a의 값을 1씩 증가 */
		/* 전역변수 a의 값 출력 */
	}
}