package com.kopo.human;

public class ObjectTest {
	public void test() {
		Radio rd = new Radio();
		Radio rd1 = new Radio();
		Radio rd2 = rd1;
		Radio rd3 = rd2;

		if (rd1.equals(rd2)) {
			System.out.println("�������� �����ϴ�.");
		}
		if (rd1 == rd2) {
			System.out.println("�������� �����ϴ�.");
		}
		
//		String b = "�����";
//		b += "�Ǵ�";
//		b += "  �����ǳ�";
//		System.out.println(b);
				
		
		String st = new String("����");
		String st1 = new String("����");
		String st2 = st1;
		if (st.equals(st1)) {
			System.out.println("���ڿ��� ����");
		}
		if (st == st2) {
			System.out.println("�������� ����");
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