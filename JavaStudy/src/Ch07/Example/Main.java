package Ch07.Example;

public class Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Human human = new Human();
		human.setName("���");
		human.setType('f');
		human.setAge(58);

		/* BloodHouse ��ü ���� */
		BloodHouse b1 = new BloodHouse();
		
		String result = ""; 
		
		result = b1.action(human);
		
		
		//action() �޼ҵ� ȣ�� ��� ����
		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		/* action() �޼ҵ� ȣ�� ��� ��� */
		System.out.println(result);
	}
}