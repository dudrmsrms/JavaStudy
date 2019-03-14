package Ch04;

import java.util.Calendar;

public class CheckTime {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour+"시");
		
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min+"분");
		
		if(hour >=12) {
			System.out.println("오후");
		}else {
			System.out.println("오전");
		}
		// 우회적인 방법으로 사이트 에서 아이디 
		//별로 횟수 제한이 있는곳을 아이디를 다르게 하여 우회접속으로 서비스 지속가능한 방법이 있다
		
		
				
	}

}
