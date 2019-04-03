package Ch06;

import java.util.Calendar;

public class Exam6_3_3 {
	public int getLastYear(int month) {
		int date = 0;

		if (month == 1 || month == 3 || month == 5) {
			date = 31;
		} else if (month == 2) {
			date = 28;
		} else {
			date = 30;
		}
		return date;

	}

	public int getLastYear2(int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		return lastDate;
		// Calendar �� �̿��� ���� ������ ã�¹��
	}

	public static void main(String[] args) {
//		System.out.println(getLastYear2(2, 1992));
		Exam6_3_3 la = new Exam6_3_3();
		System.out.println(la.getLastYear(3));
		System.out.println(la.getLastYear2(2, 1992));
//		getLastYear = �ܼ�
//		getLastYear2 = Ķ���� �̿�
	}

}
