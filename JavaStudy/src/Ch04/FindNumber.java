package Ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		//���Ѳ� ���� ���� ����
		int random =(int)(Math.random() * 100) + 1;
		
		Scanner s = new Scanner(System.in);

		System.out.println("���� �Է��ϼ���");
		int count = 0;
		while(true) {
			count = count+1;
			int num = s.nextInt();//����� �Է°�
			
			if(random == num) {
				
				System.out.println("������");
				System.out.println(count+"��°�� ����!");
				break;
			}else if(random > num) {
				System.out.println("�� ū���� �Է��ϼ���.");
				
			}else {
				System.out.println("�� �������� �Է��ϼ���.");
				
			}
			
		}System.out.println(count +" Ƚ��");
	}

}
