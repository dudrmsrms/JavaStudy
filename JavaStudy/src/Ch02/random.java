package Ch02;

public class random {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		// 0.0~<= N < 1.0  random �Լ��� ���� 
		int num1 = (int)(Math.random()*6+1);
		int num2 = (int)(Math.random()*6+1);
				
		System.out.println("1�� �ֻ���= "+ num1);		
		
		
		System.out.println("2�� �ֻ���= "+ num2);
		
		System.out.println("�ֻ����� �� = "+ (num1 + num2));
	}

}
