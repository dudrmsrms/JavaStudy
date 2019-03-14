package Exam3;

//대문자를 소문자로 변경 (소문자가 대문자보다 32만큼 더 큼, A의 코드 65 / a의 코드 97)
public class exam9 {
	public static void main(String[] args) {
		char ch = 'T';
		 char lowerCase = (char) (( ch>'A' && ch<'Z' /* A 보다 크고 Z 보다 적은 경우 */ ) ? ( ch + 32 ) : ch);
		 System.out.println("ch : " + ch);
		 System.out.println("ch to lowerCase : " + lowerCase);
		 //실행결과 ch:T 
		 //ch to lowerCase:t
	}
}
