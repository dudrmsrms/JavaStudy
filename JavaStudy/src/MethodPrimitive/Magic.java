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
				// j.j 가 마방진의 범위에서 벗어나서  - 1 의 영역으로 갈 경우 마방진에 표시할수 없으니 위치를 다시 잡아준다.
				
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
