package Ch02;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		int age = 100;
		
		//Scanner -���� �ڷ��� ���̺귯�� �ȿ� ���� �ڵ� 
		Scanner s = new Scanner(System.in);
		
		
		int num = s.nextInt();
		
		
		System.out.println(num);
		s.close();
	}

}
