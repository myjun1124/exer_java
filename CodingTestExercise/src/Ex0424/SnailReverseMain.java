package Ex0424;

import java.util.Scanner;

import Ex0420.Snail;

public class SnailReverseMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("¼ö ÀÔ·Â : ");
		int n = input.nextInt();
		SnailReverse snail = new SnailReverse(n);
		snail.make();
		snail.print();
	}
}
