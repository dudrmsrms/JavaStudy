package Ch03;

public class Operator {
	public static void main(String[] args) {
		int count = 0;
		count = count + 1;
		System.out.println(count);

		count = count + 1;
		System.out.println(count);
		
		count = ++ count;
		System.out.println(count);

		// ������ �帧 ������- > ��������
		
		//���� -& �ڵ� / �� �� -\    / ��Ÿ�� ���� -^
		// and �׸���) 
		// i = 10 �϶�
		// j = ++i; < ������  ( ������Ų�� ���Խ�Ų��)
		// j = i++; < ������  (i �� ���Խ�Ų�� 1 ������Ų��)
		
		int a = 10;
		a = -a;
		
		System.out.println(a++);//-9
		System.out.println(++a);//-8
		System.out.println(++a);//-7
		
		
	}

}
