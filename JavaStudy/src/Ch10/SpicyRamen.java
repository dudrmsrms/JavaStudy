package Ch10;


public class SpicyRamen extends Ramen { // ��� �ڵ�
	public SpicyRamen(String name) {
		super.name = name;
	}
	
	@Override// �������̵� �ڵ�
	public String getTaste() {
		return name +" �ſ� ��";
	}
}
