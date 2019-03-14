package Ch03;

import java.util.Scanner;


public class Operator2 {
	//한줄 삭제 :ctrl + D
	
	public static void main(String[] args) {
		// ctrl + alt + 화살표
		Scanner s = new Scanner(System.in);
		int num2 = s.nextInt();
		//double yg =System.currentTimeMillis();//랜덤숫자 -  유니코드 처음 태어난날을 기반으로 초단위 나타냄.1970/01/01 기준?
		double num = num2;//키보드로 숫자입력받음
		boolean 배수 = num % 3==0;
		
		System.out.println(배수);
		s.close();
	}

}
