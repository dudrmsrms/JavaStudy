package Ch03;
//논리연산자 활용법2
import java.util.Scanner;

public class Operator6 {
	public static void main(String[] args) {
		//한글자(영어)입력
		Scanner s= new Scanner(System.in);
		System.out.println("영문자를 입력해주세요.");
		String txt = s.next();
		System.out.println(txt);
		
		char txt2 = txt.charAt(0);
		
		//입력된 글자가 영어가 맞는지 검사
		
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <='z'
				  ||
				  txt2>= 'A'&& txt2 <= 'Z';
		
		//출력
		System.out.println(isCorrect);
		
		
		
	}
	

}
