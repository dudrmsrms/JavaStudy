package Ch03;

import java.util.Scanner;


public class Operator2 {
	//���� ���� :ctrl + D
	
	public static void main(String[] args) {
		// ctrl + alt + ȭ��ǥ
		Scanner s = new Scanner(System.in);
		int num2 = s.nextInt();
		//double yg =System.currentTimeMillis();//�������� -  �����ڵ� ó�� �¾���� ������� �ʴ��� ��Ÿ��.1970/01/01 ����?
		double num = num2;//Ű����� �����Է¹���
		boolean ��� = num % 3==0;
		
		System.out.println(���);
		s.close();
	}

}
