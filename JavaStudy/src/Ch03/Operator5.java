package Ch03;
//�������� Ȱ��1
public class Operator5 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result = false;
		//     ���� ���� �����̱� ������ ȿ�������� ���� num2++ �� �������� ����.(&&) �� ���
		result = num1++ < 0 && num2++ > 0;
		System.out.println(num1); // 1
		System.out.println(num2); // 0
		/*
		result = num1++ < 0 & num2++ > 0;
		System.out.println(num1); // 1
		System.out.println(num2); // 1 
		�������ڰ� �ϳ�(&)�� ���� �ڿ� num2++ �� �����. (&) �� ��� 		
		*/
	}

}
