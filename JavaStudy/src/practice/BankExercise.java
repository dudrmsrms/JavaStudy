package practice;

import java.util.Scanner;

public class BankExercise {
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner input = new Scanner(System.in);
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.���� | 2.��� |3.�ܰ� |4.����");
			System.out.println("-------------------------");
			System.out.print("����> ");

			int num1 = input.nextInt();
			if(num1==1) {
				System.out.print("���ݾ�>");
				int num = input.nextInt();
			}else if(num1==2) {
				System.out.print("��ݾ�>");
				int num = input.nextInt();
			}else if(num1==3) {
				System.out.println("�ܰ�>8000");
				
			}else if(num1==4) {
				break;
			}else {
				System.out.println("1~4�� ���ڸ� ����Ͽ� �������ּ���.");
			}
			System.out.println();
			
		}
		System.out.print("���α׷� ����");
	}

}
