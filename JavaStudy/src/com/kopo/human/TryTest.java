package com.kopo.human;

public class TryTest {
	// ����ó�� �������� Exception 
	public void test(int number ) {
		try {
			int result = 4/ number;
			System.out.println("������: " +result);
		}catch(Exception e ){
			System.out.println("�Է°��� 0�� �ü��� �����ϴ�");
			e.printStackTrace();
//			e.toString();
//			e.getMessage();
		}finally {
			//�������� ������ finally �� ���������Ѵ�.
			//���� ���� �������� �ݵ�� Ŀ�ؼ��� ������Ѵ�. 
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		TryTest tr = new TryTest();
		tr.test(0);
	}

}
