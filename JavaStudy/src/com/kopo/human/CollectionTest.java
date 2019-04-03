package com.kopo.human;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionTest {

	public void testArrayList() {
		ArrayList<Elec> al = new ArrayList<>();
		Mp3 m = new Mp3();
		Mp3 n = new Mp3();
		al.add(m);
		al.add(new Radio());
		al.add(new Tv());
		al.add(new Mp3());

		for (Elec temp : al) {
			temp.volumeDown();
			temp.volumeUp();
		}
		if (al.contains(m)) {
			System.out.println("�ش簴ü�� �ֽ��ϴ�.");
		}
		if (al.contains(n)) {
			System.out.println("1: �ش簴ü�� �ֽ��ϴ�.");
		} else {
			System.out.println("2: �ش簴ü�� �����ϴ�.");
		}
	}

	public void testHashMapList() {
		HashMap<String, Elec> hm = new HashMap<>();
		hm.put("1st", new Mp3());
		hm.put("2st", new Radio());
		hm.put("3st", new Tv());
		hm.put("4st", new Elec() {
			@Override
			public void volumeUp() {
				System.out.println("Cell�� ������");
			}
			//�ȵ���̵� ���۽� �ַ� ����� �͸� �Լ� ��� .+ �߿���
			@Override
			public void volumeDown() {
				System.out.println("Cell�� �����ٿ�");
				
			}
		});

		System.out.println(hm);

		// key ���� ���
		Set<String> ss = hm.keySet();
		for (String temp : ss) {
			System.out.println(temp);
		}
		// value ���� ���
		Collection<Elec> co = hm.values();
		for (Elec temp : co) {
			temp.volumeDown();
			temp.volumeUp();
		}
//		int size = hm.size();
//		System.out.println("�Ѱ�ü����"+size);

		// key�� value ������� (hm �� put ���� value (�ּ�)�� ��� key ���� �Է��Ͽ� �־��ش�) �� �� �������
		Set<String> ss1 = hm.keySet();
		for (String temp : ss1) {
			System.out.print("Ű���� : " + temp + " ");
			System.out.println("value ���� : " + hm.get(temp));

		}
		//
		Set<Map.Entry<String, Elec>> es = hm.entrySet();
		for (Map.Entry<String, Elec> entry : es) {
			System.out.println("Ű����1." + entry.getKey());
			System.out.println("value����2." + entry.getValue());
		}
	}

	public static void main(String[] args) {
		CollectionTest colt = new CollectionTest();
//		colt.testArrayList();
		colt.testHashMapList();
	}
	// entryset()�� �̿��Ͽ� key �� value�� ���� ������

}
