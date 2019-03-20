package Exam6;

public class Exam {
	public static int checkGrade (int num) {
		
		if(num>10) {
			num = 1;
		}else if (num > 7) {
			num = 2;
		}else if (num > 4) {
			num = 3;
		}else {
			num = 4;
		}
			
		return num;
		
	}
	public static int getBetweenSum(int num1 ,int num2) {
		 
		int sum = 0;
		if(num1 <num2) {
		for(int i = num1; i<= num2; i++) {
			sum +=i;
		}
		}else {
			for (int i = num2; i<=num1; i++) {
			sum +=i;
				
			}
		}
		
		return sum;
		
		
	}
	public static int getLastYear(int num) {
		
		int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		num =arr[num];
		
		return num;
		}
	public static String dilemma(boolean a,boolean b) {

		String result = "0";
		if(a== true&& b==true) {
			result = "A,B 둘다 5년 복역";
		}else if(a == true && b == false) {
			result = "A석방, B 10년 복역";
		}else if(a == false && b == true) {
			result = "A 10년복역, B 석방";
		}else if(a == false && b == false){
			result = "A,B 둘다 1년 복역";
		}else {
			result = "다른값을 입력해주시오";
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(checkGrade(10));
		System.out.println(getBetweenSum(7,5));
		System.out.println(getLastYear(5));
		System.out.println(dilemma(true,true));
	}

}
