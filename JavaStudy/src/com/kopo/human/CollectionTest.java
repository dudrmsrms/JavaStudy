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
			System.out.println("해당객체는 있습니다.");
		}
		if (al.contains(n)) {
			System.out.println("1: 해당객체는 있습니다.");
		} else {
			System.out.println("2: 해당객체는 없습니다.");
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
				System.out.println("Cell의 볼륨업");
			}
			//안드로이드 제작시 주로 사용할 익명 함수 기능 .+ 중요함
			@Override
			public void volumeDown() {
				System.out.println("Cell의 볼륨다운");
				
			}
		});

		System.out.println(hm);

		// key 값만 출력
		Set<String> ss = hm.keySet();
		for (String temp : ss) {
			System.out.println(temp);
		}
		// value 값만 출력
		Collection<Elec> co = hm.values();
		for (Elec temp : co) {
			temp.volumeDown();
			temp.volumeUp();
		}
//		int size = hm.size();
//		System.out.println("총객체숫자"+size);

		// key와 value 동시출력 (hm 에 put 으로 value (주소)를 담고 key 값을 입력하여 넣어준다) 그 후 동시출력
		Set<String> ss1 = hm.keySet();
		for (String temp : ss1) {
			System.out.print("키값은 : " + temp + " ");
			System.out.println("value 값은 : " + hm.get(temp));

		}
		//
		Set<Map.Entry<String, Elec>> es = hm.entrySet();
		for (Map.Entry<String, Elec> entry : es) {
			System.out.println("키값은1." + entry.getKey());
			System.out.println("value값은2." + entry.getValue());
		}
	}

	public static void main(String[] args) {
		CollectionTest colt = new CollectionTest();
//		colt.testArrayList();
		colt.testHashMapList();
	}
	// entryset()을 이용하여 key 의 value를 같이 가져옴

}
