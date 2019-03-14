package Ch04;

import java.util.Calendar;

public class CalendearExam {
	public static void main(String[] args) {
		//라이브러리 소환
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		//달력의 날짜를 지정
		cal.set(2019, 2,1);
		int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
		
		
		//달력의 요일 제목 출력하기
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("====================");
		//매월 1일의 시작 요일 맞춰주기 (여백)
		for(int i = 1; i< dayOfweek; i++) {
			
			System.out.print("   ");
		}
		//실제 날짜 출력하기
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


