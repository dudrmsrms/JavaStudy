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
		//���ڿ��� ���ڿ� �񱳴� equals �� ���Ѵ� .
		
		System.out.println("���ڸ� �Է��Ͻÿ�");
		Scanner s = new Scanner(System.in);
		
		String b = s.nextLine();
		String c = "blood";
		if (c == b) {
			System.out.println("����");
		}
	}
}