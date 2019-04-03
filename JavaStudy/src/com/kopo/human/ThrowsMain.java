package com.kopo.human;

public class ThrowsMain {
	
	public void test() {
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.test(0);
		} catch (Exception e) {
			System.out.println("¿¡·¯");
//			throw new KopoException(e);
		}
		
	}

	public static void main(String[] args) {
		ThrowsMain tm = new ThrowsMain();
		tm.test();

	}

}
