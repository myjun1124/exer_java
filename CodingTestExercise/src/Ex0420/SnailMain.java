package Ex0420;

import java.util.Scanner;

public class SnailMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int n = input.nextInt();
		Snail snail = new Snail(n);
		snail.make();
		snail.print();

	}
}
