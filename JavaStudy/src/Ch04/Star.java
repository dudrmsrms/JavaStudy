package Ch04;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				System.out.println("3�̻��� Ȧ���� �Է��ϼ���");
		int num = s.nextInt();
		for(int a = num, add = 0 ; a > 0; a-- ,add++) {
			for(int b = 0; b<a-1;b++) {
				System.out.print(" ");
			}
			for(int b = 0; b < num-(a-1)+add; b++) {
				//������ ���
				System.out.print("*");
			}System.out.println();
		}
		for(int a = 0, add = num ; a > 0; a++ ,add--) {
			for(int b = num; b<num;b--) {
				System.out.print(" ");
			}
			for(int b = num; b < (a-1)+num-a; b++) {
				//������ ���
				System.out.print("*");
			}System.out.println();
		}
	}
}
