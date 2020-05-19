package Ex0417;

public class OddMagic {
	public int x, y;
	public int[][] square;
	public int k;
	public int num = 1;
	public OddMagic(int n) {
		square = new int[n][n];
		k = n;
		x = 0;
		y = k/2;
	}
	public void make() {
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				square[x][y] = num;
				if(num%k == 0) {
					x++;
				} else {
					x--;
					y--;
					if(x<0) {
						x = k-1;
					} else if(y<0) {
						y = k-1;
					}
				}
				num++;
			}
		}
	}
	public void print() {
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(square[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
