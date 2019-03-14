package Exam4;

import java.util.Scanner;

public class SpaceExam4 {
	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);

		System.out.print("몇줄의 라인으로 할꺼냐?");
		line = input.nextInt();
		
		for(int i = line  ; i >= 0 ; i--) {
			for(int j = line  ; j >=0 ; j--) {
				
				if(j <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
