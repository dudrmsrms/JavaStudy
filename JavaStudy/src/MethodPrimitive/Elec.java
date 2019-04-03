package MethodPrimitive;

public interface Elec {	
	// 외부에서 접속시 변수 i 를 수정 불가능하다 . final 이 붙었기때문에.
	public static final int i =9;
	
	public void volumeUp();
	
	public void volumeDown();

}
