package MethodPrimitive;

public class SingleTonTest {
	private static SingleTonTest stt = new SingleTonTest() ;
		// TODO Auto-generated constructor stub
	
	private SingleTonTest() {
		// TODO Auto-generated constructor stub
	}
	public static SingleTonTest getInstance() {
		if(stt == null) {
			stt = new SingleTonTest();
		}
		return stt;
	}
	

}
