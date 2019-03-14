package Ch03;

public class Operator4 {
	public static void main(String[] args) {
		int num = 2324;
		System.out.println(num+"=시작한 숫자");
		
		while(num > 0) {
			int n = num % 10; // 마지막 자리 숫자 뜯어내기
			System.out.println(n);
			num = num/10;

		
		}
	}
}
//		//첫번째 숫자 4 뜯어내고
//		int n1 = num % 10; // 4
//		
//			
//		
//		num = num/10;
//		
//		
//		
//		//두번째 2숫자 뜯어내기
//		int n2 = num % 10;
//		
//		num = num/10;
//		int n3 = num % 10;
//		
//		num = num/10;
//		int n4 = num % 10;
//		
//		System.out.println(n1+"=첫번째 숫자 "+ n2+"=두번째 숫자 "+n3+ "=세번째 숫자 "+ n4+ "=네번째 숫자 ");
//		System.out.println("숫자들의 총합="+(n1+n2+n3+n4));
//	}
//
//}
