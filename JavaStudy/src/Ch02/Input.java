package Ch02;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		int age = 100;
		
		//Scanner -참조 자료형 라이브러리 안에 속한 코드 
		Scanner s = new Scanner(System.in);
		
		
		int num = s.nextInt();
		
		
		System.out.println(num);
		s.close();
	}

}
