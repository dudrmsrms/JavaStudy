package Ch03;
//논리연산자 활용1
public class Operator5 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result = false;
		//     앞의 식이 거짓이기 떄문에 효율적으로 뒤의 num2++ 은 실행하지 않음.(&&) 일 경우
		result = num1++ < 0 && num2++ > 0;
		System.out.println(num1); // 1
		System.out.println(num2); // 0
		/*
		result = num1++ < 0 & num2++ > 0;
		System.out.println(num1); // 1
		System.out.println(num2); // 1 
		논리연산자가 하나(&)일 경우는 뒤에 num2++ 도 실행됨. (&) 일 경우 		
		*/
	}

}
