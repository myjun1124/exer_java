package Ex0417;

public class OddMagicPractice {
	public int x, y;
	public int[][] square;
	public int k;
	public int num = 1;
	public OddMagicPractice(int n) {
		square = new int[n][n];
		k = n;
		x = 0;
		y = k/2;
		square[x][y] = num;
	}
	public void make() {
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				if(square[x][y] == 0) {
					
				}
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
