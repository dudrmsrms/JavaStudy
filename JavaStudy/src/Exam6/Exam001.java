package Exam6;

public class Exam001 {
	public static void main(String[] args) {
		 int n = 1000000;
		 int total = sum(n);
		 System.out.println("1 ~ " + n + " ������ �� : " + total);
		 }

// �޼ҵ� �ۼ� 
	public static int sum(int n) {
		int total =0;
		for (int i = 1 ; i < n; i++) {
			total += i;
		}
		return total;
	}
}
