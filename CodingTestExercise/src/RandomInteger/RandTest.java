package RandomInteger;

import java.util.Scanner;

public class RandTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�ڿ����� ���� �Է� : ");
		int range = input.nextInt();
		System.out.println("����� �ڿ����� ���� �Է� : ");
		int nums = input.nextInt();
		
		RandomInteger randI = new RandomInteger(range, nums);
		randI.make();
		randI.print();
		
	}

}
