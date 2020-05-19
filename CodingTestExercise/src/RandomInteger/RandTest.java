package RandomInteger;

import java.util.Scanner;

public class RandTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("자연수의 범위 입력 : ");
		int range = input.nextInt();
		System.out.println("출력할 자연수의 개수 입력 : ");
		int nums = input.nextInt();
		
		RandomInteger randI = new RandomInteger(range, nums);
		randI.make();
		randI.print();
		
	}

}
