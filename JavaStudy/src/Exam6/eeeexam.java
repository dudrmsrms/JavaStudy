package Exam6;

public class eeeexam {
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
		System.out.println(dilemma(false,true));
	}
}
