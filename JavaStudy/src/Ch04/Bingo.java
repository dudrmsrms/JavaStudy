package Ch04;

public class Bingo {
	public static void main(String[] args) {
		for(int i = 1; i <= 31; i++) {
			System.out.print(i+"\t");
			if(i % 7 ==0) {
				System.out.println();
			}
		}
	}

}
