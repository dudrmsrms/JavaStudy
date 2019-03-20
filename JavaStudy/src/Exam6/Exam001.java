package Exam6;

public class Exam001 {
	public static void main(String[] args) {
		 int n = 1000000;
		 int total = sum(n);
		 System.out.println("1 ~ " + n + " 까지의 합 : " + total);
		 }

// 메소드 작성 
	public static int sum(int n) {
		int total =0;
		for (int i = 1 ; i < n; i++) {
			total += i;
		}
		return total;
	}
}
