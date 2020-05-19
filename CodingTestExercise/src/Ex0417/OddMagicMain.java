package Ex0417;

import java.util.Scanner;

public class OddMagicMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("È¦ ¼ö ÀÔ·Â");
		int n = input.nextInt();
		OddMagic odd = new OddMagic(n);
		odd.make();
		odd.print();
	}
}
