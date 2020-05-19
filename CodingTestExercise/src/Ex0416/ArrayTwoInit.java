package Ex0416;

import java.util.Arrays;

public class ArrayTwoInit {
	
	public static void main(String[] args) {
		System.out.println("//2차원 배열 방법 1");
		int[][] a1 = new int[4][3];	//4X3
		a1[0][0] = 1;
		a1[0][1] = 2;
		
		print(a1);
		System.out.println("//2차원 배열 방법 2 (JigJagged도 가능");
		int[][] a2 = {{0,0,0,0},{0,0,0,0,0},{0,0,0}};
		ArrayTwoInit.print(a2);
		System.out.println("//2차원 배열 방법 3");
		int[][] a3 = new int[3][5];
		int k = 1;
		for(int i=0;i<a3.length;i++) {
			if(i==1) {
				k=2;
			} else if(i==2) {
				k=6;
			}
			for(int j=0;j<a3[i].length;j++) {
				a3[i][j] = k;
				k++;
				if(k==10) {
					k=0;
				}
			}
		}
		ArrayTwoInit.print(a3);
		System.out.println("//copy1");
		int[][] a4 = new int[3][5];
		System.arraycopy(a3, 0, a4, 0, a3.length);
		ArrayTwoInit.print(a4);
	}
	
	public static void print(int[][] n) {
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print("[" + n[i][j] + "]");
			}
			System.out.println();
		}
	}

}
