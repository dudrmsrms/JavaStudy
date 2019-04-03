package com.kopo.human;

public class TryTest {
	// 예외처리 연습예제 Exception 
	public void test(int number ) {
		try {
			int result = 4/ number;
			System.out.println("결과출력: " +result);
		}catch(Exception e ){
			System.out.println("입력값이 0이 올수는 없습니다");
			e.printStackTrace();
//			e.toString();
//			e.getMessage();
		}finally {
			//마지막엔 무조건 finally 를 사용해줘야한다.
			//서버 사용시 마지막엔 반드시 커넥션을 끊어야한다. 
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		TryTest tr = new TryTest();
		tr.test(0);
	}

}
