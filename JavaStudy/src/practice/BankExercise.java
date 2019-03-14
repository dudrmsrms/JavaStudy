package practice;

import java.util.Scanner;

public class BankExercise {
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner input = new Scanner(System.in);
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 |3.잔고 |4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");

			int num1 = input.nextInt();
			if(num1==1) {
				System.out.print("예금액>");
				int num = input.nextInt();
			}else if(num1==2) {
				System.out.print("출금액>");
				int num = input.nextInt();
			}else if(num1==3) {
				System.out.println("잔고>8000");
				
			}else if(num1==4) {
				break;
			}else {
				System.out.println("1~4의 숫자만 사용하여 조작해주세요.");
			}
			System.out.println();
			
		}
		System.out.print("프로그램 종료");
	}

}
