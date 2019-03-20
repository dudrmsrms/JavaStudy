package Exam5;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		//문제1. 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		Scanner s= new Scanner(System.in);
		System.out.println("양의정수 10개 입력");
		int []num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i]= s.nextInt();
		}
		System.out.println("3의 배수: ");
		for(int i =0; i<num.length;i++) {
			if (num[i]%3 ==0) {
				System.out.println(num[i]+" ");
			}
				
		}
		s.close();
	}

}
