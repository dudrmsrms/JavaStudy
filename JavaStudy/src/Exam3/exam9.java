package Exam3;

//�빮�ڸ� �ҹ��ڷ� ���� (�ҹ��ڰ� �빮�ں��� 32��ŭ �� ŭ, A�� �ڵ� 65 / a�� �ڵ� 97)
public class exam9 {
	public static void main(String[] args) {
		char ch = 'T';
		 char lowerCase = (char) (( ch>'A' && ch<'Z' /* A ���� ũ�� Z ���� ���� ��� */ ) ? ( ch + 32 ) : ch);
		 System.out.println("ch : " + ch);
		 System.out.println("ch to lowerCase : " + lowerCase);
		 //������ ch:T 
		 //ch to lowerCase:t
	}
}
