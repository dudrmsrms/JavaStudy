package Ch06;

public class MethodExam3 {
	/* max ������ ���� �� ������ Ȧ���� �̾��ִ� �޼ҵ�*/
public static int RandomNumber(int max) {
	while(true) {
	int num = (int)(Math.random()*max)+1;
	if (num %2 !=0) {
		return num;
	}
	}
}
public static void main(String[] args) {
	int num = RandomNumber(100);
	System.out.println(num);
	
}

}