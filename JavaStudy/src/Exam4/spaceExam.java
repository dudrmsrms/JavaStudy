package Exam4;

public class spaceExam {
	public static void main(String[] args) {
		
		int line = 20;
		int space =line-1;
		for(int a = 0 ; a <line ; a++) {
			space =space -1;
			for(int b = 0; b <line ; b++) {
				//������ ���
				if(space>b) {
					System.out.print("  ");
					
				}else{
				System.out.print("��");
				}
				
			}System.out.println();
		}
	}
}
