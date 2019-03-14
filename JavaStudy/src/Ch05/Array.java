package Ch05;

public class Array {
	public static void main(String[] args) {
		int[] s1 = {1,2,3,4};
		for(int i =0; i < s1.length; i++) {
			if(i ==s1.length-1) {
				System.out.println(s1[i]);
			}
			
		}
		
		
		
		
		int[] s2 = new int[4];
		s2[0] =10;
		s2[1] =20;
		s2[2] =30;
		s2[3] =40;
//		
//		s1 과 s2 는 기본자료형이 아닌 참조자료형으로 여러개의 박스로 나눠져 있다고
		//생각될 수 있다.
//		System.out.println(s1.length);
//		System.out.println(s2);
//		
	}

}
