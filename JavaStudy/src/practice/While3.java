package practice;

public class While3 {
	public static void main(String[] args) {
		//�ֻ����� ���� ������ ������ ���� ���� 5�϶� �����.
		int count = 0;
		
		while(true) {
			int num1 =(int) (Math.random()*6+1);
			int num2 =(int) (Math.random()*6+1);
			count = count +1;
			System.out.println("("+num1+","+num2+")");
			if((num1+num2)==5) {
				break;
			}
			}
		System.out.println("���� Ƚ��"+count);
				
		}
			
		//System.out.println(num1+","+num2);
		
	}
	


