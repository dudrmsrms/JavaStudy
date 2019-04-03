package com.kopo.human;

public class ObjectTest {
	public void test() {
		Radio rd = new Radio();
		Radio rd1 = new Radio();
		Radio rd2 = rd1;
		Radio rd3 = rd2;

		if (rd1.equals(rd2)) {
			System.out.println("참조값이 같습니다.");
		}
		if (rd1 == rd2) {
			System.out.println("참조값이 같습니다.");
		}
		
//		String b = "몰라요";
//		b += "되니";
//		b += "  정말되네";
//		System.out.println(b);
				
		
		String st = new String("ㄱㄱ");
		String st1 = new String("ㄱㄱ");
		String st2 = st1;
		if (st.equals(st1)) {
			System.out.println("문자열이 같다");
		}
		if (st == st2) {
			System.out.println("참조값이 같다");
		}
		System.out.println(new Mp3());
		System.out.println(new BDSDto());

	}

	@Override
	public String toString() {
		return "ObjectTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.test();

		System.out.println();
	}

}