package Ch04;

import java.util.Calendar;

public class CalendearExam {
	public static void main(String[] args) {
		//���̺귯�� ��ȯ
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		//�޷��� ��¥�� ����
		cal.set(2019, 2,1);
		int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
		
		
		//�޷��� ���� ���� ����ϱ�
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("====================");
		//�ſ� 1���� ���� ���� �����ֱ� (����)
		for(int i = 1; i< dayOfweek; i++) {
			
			System.out.print("   ");
		}
		//���� ��¥ ����ϱ�
		for(int i = 1; i<= lastDate; i++) {
			
			
			
			
			if (i<10) {
				System.out.print("0" +i+" ");
			}else {
				System.out.print(i+" ");
			}
			
			if(dayOfweek % 7 == 0) {
				System.out.println();
			}dayOfweek++;
				
			}
		}

			
	}


