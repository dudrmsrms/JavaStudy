package MethodPrimitive;

public class Magic {
	public void magic(int n) {
		int[][] ma = new int[n][n];
		int i = 0;
		int j = n / 2;
		for (int a = 1; a <= (n * n); a++) {
			ma[i][j] = a;
			if (a% n == 0) {
				i++;
			} else {
				i--;
				j--;
				// j.j �� �������� �������� �����  - 1 �� �������� �� ��� �������� ǥ���Ҽ� ������ ��ġ�� �ٽ� ����ش�.
				
				if (i < 0) {
					i = n + i;
				} else if (j < 0) {
					j = n + j;
				}
			}
			

		}
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				System.out.print(ma[a][b] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Magic ma = new Magic();
		ma.magic(7);
	}
}
