package Ex0413;

import java.util.Scanner;

public class Sums {
	private int num;
	private int totalAll=0;
	private int totalOdd=0;
	
	public Sums(int num) {
		this.num = num;
	}
	public int TotalAll() {
		for(int i=0;i<num+1;i++) {
			this.totalAll += i;
		}
		return totalAll;
	}
	public int TotalOdd() {
		for(int i=0;i<num+1;i++) {
			if(i%2 == 0) {
				continue;
			} else {
				this.totalOdd += i;
			}
		}
		return totalOdd;
	}
	public void print() {
		System.out.println("1~" + num + "까지의 합 : " + totalAll);
		System.out.println("1~" + num + "까지 홀수의 합 : " + totalOdd);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = input.nextInt();
		Sums s = new Sums(n);
		s.TotalAll();
		s.TotalOdd();
		s.print();
	}
}
