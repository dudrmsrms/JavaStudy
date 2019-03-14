package practice;

public class While3 {
	public static void main(String[] args) {
		//주사위를 굴려 나오는 숫자의 눈의 합이 5일때 멈춘다.
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
		System.out.println("던진 횟수"+count);
				
		}
			
		//System.out.println(num1+","+num2);
		
	}
	


