package Exam4;

public class Exam4_4_2 {
	
	public static void main(String[] args) {
		//1000 이하이면서 2*7의 배수인것 출력
		int total =0;
		
		for(int i = 1; i<=1000; i++) {
			if(i % 2 ==0 && i % 7 == 0) {
				total += i;
				System.out.println(i);
			}
		}System.out.println(total);
//		//i*j =14 
//		for(int i = 1 ; i <= 100; i++) {
//			if( i * 14 <= 1000 ) {
//				total +=i*14;
//				System.out.println(i*14);
//				
//				
//			}
//		}System.out.println("숫자들의 합은 = " +total);
//			
	}

}
