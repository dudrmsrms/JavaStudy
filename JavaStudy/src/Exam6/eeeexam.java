package Exam6;

public class eeeexam {
	public static String dilemma(boolean a,boolean b) {

		String result = "0";
		if(a== true&& b==true) {
			result = "A,B �Ѵ� 5�� ����";
		}else if(a == true && b == false) {
			result = "A����, B 10�� ����";
		}else if(a == false && b == true) {
			result = "A 10�⺹��, B ����";
		}else if(a == false && b == false){
			result = "A,B �Ѵ� 1�� ����";
		}else {
			result = "�ٸ����� �Է����ֽÿ�";
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(dilemma(false,true));
	}
}
