package Ch04;

import java.util.Calendar;

public class CheckTime {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour+"��");
		
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min+"��");
		
		if(hour >=12) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		// ��ȸ���� ������� ����Ʈ ���� ���̵� 
		//���� Ƚ�� ������ �ִ°��� ���̵� �ٸ��� �Ͽ� ��ȸ�������� ���� ���Ӱ����� ����� �ִ�
		
		
				
	}

}
