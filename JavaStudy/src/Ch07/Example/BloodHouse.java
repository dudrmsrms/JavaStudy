package Ch07.Example;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; // �������� ���̸� Ȯ���Ͽ� ����
		boolean isPossible = false; // ���� ���� ����
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		age = human.getAge();
		
		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		if (age >= 16 && age < 69) {
			isPossible = true;
		} else {
			isPossible = false;
		}
		

		
		return isPossible;
	}

	public String action(Human human) {
//		String name = human.name;
//		char blood = human.type;
		String result = ""; // ���� ��� ����
//		BloodHouse b = new BloodHouse();
//		result = b.isPossible(human); boolean ��  String �� �����Ұ� .
//		boolean ox = isPossible(human);

		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		if (isPossible(human) == true) {
			result = "������ �Ϸ�Ǿ����ϴ�." + human.name + "�� " + human.type + "�� ���� �����մϴ�.";
		} else {
			result = "������ �Ұ����մϴ�.";
		}
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		/* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		return result;
	}
}