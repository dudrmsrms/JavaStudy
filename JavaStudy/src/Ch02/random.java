package Ch02;

public class random {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		// 0.0~<= N < 1.0  random 함수의 범위 
		int num1 = (int)(Math.random()*6+1);
		int num2 = (int)(Math.random()*6+1);
				
		System.out.println("1번 주사위= "+ num1);		
		
		
		System.out.println("2번 주사위= "+ num2);
		
		System.out.println("주사위의 합 = "+ (num1 + num2));
	}

}
