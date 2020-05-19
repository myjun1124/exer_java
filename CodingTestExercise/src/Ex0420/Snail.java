package Ex0420;

public class Snail {
	public int n, m;
	public int x=0, y=-1;
	public int k=1;
	public int[][] trace;
	public int num = 1;
	public Snail(int n) {
		this.n = n;
		m = n;
		trace = new int[n][n];
	}
	public void make() {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				y+=k;
				trace[x][y] = num;
				num++;
			}
			n--;
			for(int j=0;j<n;j++) {
				x+=k;
				trace[x][y] = num;
				num++;
			}
			k=k*-1;
		}
	}
	public void print() {
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(trace[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
