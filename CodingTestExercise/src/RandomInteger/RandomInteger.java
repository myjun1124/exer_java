package RandomInteger;

import java.util.Arrays;

public class RandomInteger {
	private int[] randomInt;
	private int range;			//1~10������ ���� ����
	private int arrSize;		//3���� ���� ���� ���� �迭
	
	public RandomInteger(int range, int arrSize) {
		this.range = range;
		this.arrSize = arrSize;
		randomInt = new int[arrSize];
	}
	
	public int rand() {
		return (int)(Math.random()*range)+1;	//�����Լ� ���� ����
	}
	
	public boolean contain(int n) {				//�迭�� �ߺ��� ���� ����ִ� �� �˻�
		boolean isC = true;
		for(int i=0;i<randomInt.length;i++) {
			if(randomInt[i]==n) {
				isC = false;
				break;
			}
		}
		return isC;
	}
	
	public void make() {						//�� contain�Լ��� ���� Ȱ���Ͽ� �ߺ��� �� ���� �迭�� �� �ֱ�
		Arrays.fill(randomInt, 0);
		int count = 0;
		while(count != arrSize) {
			int temp = rand();
			if(contain(temp)) {
				randomInt[count++] = temp;
			}
		}
	}
	
	public void print() {
		for(int i=0;i<randomInt.length;i++) {
			if(i==randomInt.length-1) {
				System.out.print(randomInt[i]);
			} else {
				System.out.print(randomInt[i] + ", ");
			}
		}
		System.out.println();
	}
	
}
