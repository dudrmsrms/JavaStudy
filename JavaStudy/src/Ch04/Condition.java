package Ch04;

public class Condition {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		
		// 0.0<= X <1.0
		dice1 = (int)(Math.random()*6)+1;  // 1~6
		dice2 = (int)(Math.random()*6)+1;  // 1~6
		System.out.println(dice1 + " "+ dice2);
		if(dice1 == dice2) {
			System.out.println("�ѹ� �� ��������.");
		
			dice1 = (int)(Math.random()*6)+1;  // 1~6
			dice2 = (int)(Math.random()*6)+1;  // 1~6
			System.out.println(dice1+" "+ dice2);
		}
		
		
		
		
		/*
		// ���ǽ��� �׻� true �Ǵ� false ��
		char gender = 'M';
		if(gender == 'M') {
			System.out.println("��������");
		}else{
		 	System.out.println("����");
		}
		
		if() {
			
		}
		boolean a = false;
		if(a) {
			
		}*/
	}

}
