package Exam5;

public class Exam5_5 {
	public static void main(String[] args) {
		 int[][] arr = {
		 {95, 86},
		 {83, 92, 96},
		 {78, 83, 93, 87, 88}
		 };

		 int count =0;
		 int sum = 0;
		 double avg = 0.0;
		 for (int i = 0; i<arr.length; i++) {
			 for(int j = 0; j<arr[i].length; j++) {
				 if(arr[i][j]>0) {
				 sum = sum + arr[i][j];
				 count ++;
				 }
			 }
			 
		 }
		 avg = sum/(double)count;

		 // �ڵ� �ۼ�
		 
		 System.out.println("�� : " + sum);
		 System.out.println("��� : " + avg);
		 }


}