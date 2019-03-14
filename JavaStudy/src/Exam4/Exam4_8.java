package Exam4;

public class Exam4_8 {
	public static void main(String[] args) {
		int count= 0;
		//1 ~ 1000 사이의 숫자 중 3을 포함하고 있는 숫자를 출력
		for(int i = 1; i <= 1000; i++) {
			//3 4 5 6
			//12
			// i % 3 ==0
			// i==3
			int num =i;
			while (num>0) {
				//13 31
				int n = num %10;
				if (n == 3) {
					System.out.println(i);

					count = count +1;
					break;
				}
				num = num /10; //3
			}
//			
//			if( (i % 10)==3 ) {
//				System.out.println(i + " : 3포함 ");
//			}else if(((i /10)%10) ==3){
//				System.out.println(i + "  : 3포함");
//			}
			 // 코드 작성
			 }
		System.out.println(count+": 출력횟수");
	}

}
