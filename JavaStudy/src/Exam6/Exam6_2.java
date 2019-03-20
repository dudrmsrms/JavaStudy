package Exam6;

import java.util.Arrays;

public class Exam6_2 {
	public static void main(String[] args) {
		int num = 5;
		int[] nums = {5};
		a(num);
		b(nums);
		System.out.println(num);
		System.out.println(nums[0]);
		// 참조자료형으 ㅣ 주소값 활용
		char[] ch = {'h','e','l','l','o'};
		Arrays.sort(ch);
		System.out.println(ch);
	}
	public static void a (int num) {
		num = num * 30;
		
	}
	public static void b (int[] nums) {
		nums[0]= nums[0]*30;
	}

}
