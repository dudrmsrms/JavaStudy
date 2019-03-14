package Ch03;

public class Operator {
	public static void main(String[] args) {
		int count = 0;
		count = count + 1;
		System.out.println(count);

		count = count + 1;
		System.out.println(count);
		
		count = ++ count;
		System.out.println(count);

		// 연산의 흐름 오른쪽- > 왼쪽으로
		
		//논리곱 -& 코드 / 논리 합 -\    / 베타적 논리합 -^
		// and 그리고) 
		// i = 10 일때
		// j = ++i; < 전위식  ( 증가시킨후 대입시킨다)
		// j = i++; < 후위식  (i 를 대입시킨후 1 증가시킨다)
		
		int a = 10;
		a = -a;
		
		System.out.println(a++);//-9
		System.out.println(++a);//-8
		System.out.println(++a);//-7
		
		
	}

}
