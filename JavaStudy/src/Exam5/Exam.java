package Exam5;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		//����1. ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���.
		Scanner s= new Scanner(System.in);
		System.out.println("�������� 10�� �Է�");
		int []num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i]= s.nextInt();
		}
		System.out.println("3�� ���: ");
		for(int i =0; i<num.length;i++) {
			if (num[i]%3 ==0) {
				System.out.println(num[i]+" ");
			}
				
		}
		s.close();
	}

}
