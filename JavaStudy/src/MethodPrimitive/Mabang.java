package MethodPrimitive;

public class Mabang {
	int num;
	int[][] mabang;

	public void mabang(int num) {
		this.num = num;
		mabang = new int[num][num];

		int x = 0;
		int y = num / 2;
		mabang[x][y] = 1;
		for (int i = 2; i <= num * num; i++) {
			x = x - 1;
			y = y - 1;
			
			if (x < 0) {
				if (y < 0) {
					x = x + 2;
					y = y + 1;
				} else {
					x = num + x;
				}
			} else {
				if (y < 0) {
					y = y + num;
				} else {
					if (mabang[x][y] != 0) {
						x = x + 2;
						y = y + 1;
					}
				}
			}
			mabang[x][y] = i;

		}
		for (int i = 0; i < mabang.length; i++) {
			for (int j = 0; j < mabang.length; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();
		}
//		for(int[]temp  : mabang) {
//			for(int present : temp) {
//				System.out.print(present+"\t");
//			}
//			System.out.println();
//		}
	}

	public static void main(String[] args) {
		Mabang ma = new Mabang();
		ma.mabang(6);

	}

}
