package Ch06;

//매소드 생성 규칙
//반드시 클래스 내에 표현되어야 한다.
//메소드 내에 표현할 수 없음.
//위치가 상관없음.

public class MethodTest2 {
	public static boolean hasNegative(int[]arr) {
		for(int i = 0;i < arr.length; i++) {
			if(arr[i]<0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[]arr = { 1, 2, 3, 4, 5,10};
		
		boolean b =hasNegative(arr);
		System.out.println(b);
	}
	
		
		
	

}
