package Exam6;

public class cutOperation {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		// 2�ּҰ�
		// 1�� ���� 3 2 2 0 0 6 =>4��
		// 2�� ���� 1 0 0 -2 -2 4 =>2��
		while (true) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < stick.length; i++) {
//			min = stick[i]<min;
				if (stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;

			}
			int count = 0;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if (count == 0) {
				break;
			}
		}

	}

}
