package another;

import Ch07.Notebook;

public class Test {
	public static void main(String[] args) {
		Notebook nb1 = new Notebook();
		nb1.setPrice(100);
		nb1.setSize(10);
		nb1.setBrand("samsung");
//		nb1.price = 100;// 사용불가
		nb1.pirnt();
	}

}
