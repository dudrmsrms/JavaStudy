package Ch10;

public class SaltyRamen extends Ramen { // ��� �ڵ�
	public SaltyRamen(String name) {
		super.name = name;
	}
	@Override// �������̵� �ڵ� 
	public String getTaste() {
		return name + " § ��";
	}
}