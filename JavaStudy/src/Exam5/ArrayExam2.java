package Exam5;

public class ArrayExam2 {
	public static void main(String[] args) {
		int[] numbers = 
			{3,2,1,7,4,4,2,6,4,7,9,3,5,1,2,4,65,7,3,24,6,345,35,8,465,57,468,3,45,24,6,352,5};
		int temp = Integer.MAX_VALUE;
		
		int min = 0;
		int count = 0;
		for(int i = 0; i< numbers.length; i++) {
			count = count +1;
			if(numbers[i]>min || min==0) {
				min = numbers[i];
			}
		}
		System.out.println("�ִ밪 " + min +","+count );
		System.out.println(temp);
	}

}
