package practice;

public class TableExam {
	public static void main(String[] args) {
		for (int m = 1; m<=9; m++) {
			
			//System.out.println(m+"´Ü");
			for(int n = 2; n<=9; n++) {
				System.out.print(n +" * "+m +" = "+(n*m)+"\t");
				
			}
			System.out.println();
			if(m==9) {
			for(int i = 2; i < 10; i++){
				System.out.print("***"+i+"´Ü"+"***"+"\t");
			}
			}
		}
			
	}

}
