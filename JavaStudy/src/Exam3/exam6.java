package Exam3;

import java.util.Scanner;

public class exam6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		 int n = scanner.nextInt();
		 int ten = 0; // 10�� �ڸ� ���� ������ ����
		 int one = 0; // 1�� �ڸ� ���� ������ ����
		 boolean isMatch = false; // �� �ڸ� �� �� ���� ������ ����
		 ten = (n / 10)*10;
		 one = n % 10;
		 isMatch = ten+one<86 &&  ten+one>=33;
		 
		 //boolean isMatch = ten>3 &&ten<8;
		 
		 
		 
		 /* ten ������ 10�� �ڸ� �� ���� */
		 /* one ������ 1�� �ڸ� �� ���� */
		 /* isMatch ������ �� ���� �ڸ� �� �� �� ���� */

		 System.out.println(isMatch);
		 scanner.close();

	}
}
