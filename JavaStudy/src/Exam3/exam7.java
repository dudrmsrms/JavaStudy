package Exam3;

public class exam7 {
	public static void main(String[] args) {
		int num = 12345;

		int num1, num2, num3, num4, num5;
		
		num1 = num % 10;

		num = num / 10;
		num2 = num % 10;

		num = num / 10;
		num3 = num % 10;

		num = num / 10;
		num4 = num % 10;

		num = num / 10;
		num5 = num % 10;
		/*
		 * int num1= num/10000; int num2= (num/1000)%10; int num3= (num/100)%10; int
		 * num4= (num/10)%10; int num5= (num)%10; // 코드 작성 (% 연산자)
		 */
		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("각 자리 숫자의 합 : " + total);

	}
}
