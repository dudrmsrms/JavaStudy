package Exam4;

public class Exam4_8 {
	public static void main(String[] args) {
		int count= 0;
		//1 ~ 1000 ������ ���� �� 3�� �����ϰ� �ִ� ���ڸ� ���
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
//				System.out.println(i + " : 3���� ");
//			}else if(((i /10)%10) ==3){
//				System.out.println(i + "  : 3����");
//			}
			 // �ڵ� �ۼ�
			 }
		System.out.println(count+": ���Ƚ��");
	}

}
