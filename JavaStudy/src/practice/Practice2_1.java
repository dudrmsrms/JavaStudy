package practice;

public class Practice2_1 {
	public static void main(String[] args) {

		int[] n = { 5, 4, 4, 2, 2, 8 };

		int temp = 0;
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] > n[j]) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}

			}
		}
		int min = 0;
		int count =0;
		for (int i =0; i <n.length-1; i++) {
			for(int j= i+1; j<n.length;j++) {
				if (n[i]>min) {
					count ++;
					
				}
			
				
				
			}
			System.out.println(count);
		}
	
//		for (int i = 0; i < n.length; i++) {
//			System.out.print(n[i] + " ");
		}
	}
