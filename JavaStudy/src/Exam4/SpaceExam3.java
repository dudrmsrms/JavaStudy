package Exam4;

import java.util.Scanner;

public class SpaceExam3 {
	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);

		System.out.print("������ �������� �Ҳ���?");
		line = input.nextInt();
		
		for(int i = 0 ; i < line ; i++) {
			for(int j = 0 ; j < line ; j++) {
				
				if(j < line-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
