package Ch03;

public class Operator4 {
	public static void main(String[] args) {
		int num = 2324;
		System.out.println(num+"=������ ����");
		
		while(num > 0) {
			int n = num % 10; // ������ �ڸ� ���� ����
			System.out.println(n);
			num = num/10;

		
		}
	}
}
//		//ù��° ���� 4 ����
//		int n1 = num % 10; // 4
//		
//			
//		
//		num = num/10;
//		
//		
//		
//		//�ι�° 2���� ����
//		int n2 = num % 10;
//		
//		num = num/10;
//		int n3 = num % 10;
//		
//		num = num/10;
//		int n4 = num % 10;
//		
//		System.out.println(n1+"=ù��° ���� "+ n2+"=�ι�° ���� "+n3+ "=����° ���� "+ n4+ "=�׹�° ���� ");
//		System.out.println("���ڵ��� ����="+(n1+n2+n3+n4));
//	}
//
//}
