package Ch12;

import java.util.Scanner;

public class Equals {
	public static void main(String args[]) {
		String s1 = "hi";
		String s2 = "hi";
		System.out.println(s1 == s2 );
		String s3 = new String("hi");
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		//문자열과 문자열 비교는 equals 로 비교한다 .
		
		System.out.println("문자를 입력하시오");
		Scanner s = new Scanner(System.in);
		
		String b = s.nextLine();
		String c = "blood";
		if (c == b) {
			System.out.println("빙고");
		}
	}
}