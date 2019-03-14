package Exam4;
import java.util.Scanner;

public class spaceExam2 {
	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);
		
		System.out.print("몇줄의 라인으로 할꺼냐?");
		line = input.nextInt();
		
		for(int i=0; i<line; i++){
			// i= 0이니까 1회 실행.
			for(int j=0; j<line; j++) {
				// line 이 될때까지 1씩 더하며 ★출력.
				if(j>line-i-2) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			
				System.out.println();
		}
		
		
		
//		
//		for(int i=line-1; i>=0; i--) {
//            for(int j=0; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }		
//		
	}
}
	
		
		
		
		
		
		
		
		
//	//int line = 20;
//	int space =5;
//	for(int a = 1 ; a >6 ; a++) {
//		space =space -1;
//		for(int b = 10; b == 1 ; b--) {
//			//옆으로 출력 b=6
//			if(space<b) {
//				System.out.print("  ");
//				
//			}else{
//			System.out.print("★");
//			}
//			
//		}System.out.println();
//	}
//	}
//}
