package Exam4;

import java.util.Scanner;

public class CountExam {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. =>");
		int num = s.nextInt();
		int count = 0;
		for(int i =1; i <= num; i++ ) {
			int num1 =i;
			
			while(num1 > 0) {
				
				int n = num1 % 10;
				if (n == 8) {
					//횟수 세기 
					count++;
					
					
				}
				num1 = num1 / 10;
				
			}
		}
		System.out.println(count);
	}

}
