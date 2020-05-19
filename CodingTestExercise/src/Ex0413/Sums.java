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
		System.out.println("1~" + num + "������ �� : " + totalAll);
		System.out.println("1~" + num + "���� Ȧ���� �� : " + totalOdd);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�Է� : ");
		int n = input.nextInt();
		Sums s = new Sums(n);
		s.TotalAll();
		s.TotalOdd();
		s.print();
	}
}
