package Exam4;

import java.util.Scanner;

public class Exam4_4 {
	public static void main(String[] args) {
		System.out.println("���� :0,  ���� : 1, ��:2");
		Scanner s = new Scanner(System.in);
		
		boolean isContinue = true;
		while(isContinue) {	
			System.out.println("0~2 �����ּ���");
			int player = s.nextInt();
			int com = (int)(Math.random()*3);
			
		//		int player = 1;// ���� ����������
		//		int com = 2; // �� ��ǻ�Ͱ� ����
			if ((player+1)%3 ==com) {
				System.out.println("���� �й��."+com);
			}else {
				if(player ==com) {
					System.out.println("���"+com);
				}
				else {
				System.out.println("���� �¸�"+com);
				isContinue = false;
				}	
			}
		}
	}
}
