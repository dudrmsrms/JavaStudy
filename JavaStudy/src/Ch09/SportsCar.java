package Ch09;

public class SportsCar extends Car {
	char color = 'R';

	
	@Override //����
	void move() {
		System.out.println("������ī �̵� �ü� 300km");
	}

	SportsCar() {
		System.out.println("SportsCar ��ü ����");
	}

	void openSunloof() {
		System.out.println("����� ����");
	}
}
