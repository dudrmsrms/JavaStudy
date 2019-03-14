package Exam4;

import java.util.Scanner;

public class Exam4_4 {
	public static void main(String[] args) {
		System.out.println("가위 :0,  바위 : 1, 보:2");
		Scanner s = new Scanner(System.in);
		
		boolean isContinue = true;
		while(isContinue) {	
			System.out.println("0~2 적어주세요");
			int player = s.nextInt();
			int com = (int)(Math.random()*3);
			
		//		int player = 1;// 바위 유저가낸거
		//		int com = 2; // 보 컴퓨터가 낸거
			if ((player+1)%3 ==com) {
				System.out.println("너의 패배다."+com);
			}else {
				if(player ==com) {
					System.out.println("비김"+com);
				}
				else {
				System.out.println("나의 승리"+com);
				isContinue = false;
				}	
			}
		}
	}
}
