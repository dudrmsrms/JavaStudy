package Ch01;

public class Exam01_1 {
	public static void main(String[] args) {
		
		/*
		 *  // System.out.println("1 + 2 + 3 의 연산 결과는 '6' 입니다");
 // System.out.println("1 + 2 + 3 의 연산 결과는 \"6\" 입니다");
 // System.out.println("1 ~ 5 까지의 곱셈 결과는 120 입니다");

		 */
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		
		int result = a*b*c*d*e;
		System.out.println(result);
				/*
				 * "+"의미를 생각해본다 .
				 * 하단의 println들의 의미를  ㅅㅁㄴ.ㅇ...ㅅㅂ 노가다
				 * */
		System.out.println("1 + 2 + 3 의 연산 결과는 '"+(1+2+3)+"' 입니다");
		System.out.println("1 + 2 + 3 의 연산 결과는 \""+6+"\" 입니다");
		System.out.println("1 ~ 5 까지의 곱셈 결과는 "+1*2*3*4*5+" 입니다");
		
	
		}

}
