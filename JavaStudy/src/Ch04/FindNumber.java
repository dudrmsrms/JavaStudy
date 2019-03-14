package Ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		//병뚜껑 숫자 생성 랜덤
		int random =(int)(Math.random() * 100) + 1;
		
		Scanner s = new Scanner(System.in);

		System.out.println("값을 입력하세요");
		int count = 0;
		while(true) {
			count = count+1;
			int num = s.nextInt();//사용자 입력값
			
			if(random == num) {
				
				System.out.println("맞췄음");
				System.out.println(count+"번째에 성공!");
				break;
			}else if(random > num) {
				System.out.println("더 큰수를 입력하세요.");
				
			}else {
				System.out.println("더 적은수를 입력하세요.");
				
			}
			
		}System.out.println(count +" 횟수");
	}

}
