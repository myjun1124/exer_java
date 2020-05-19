package RandomInteger;

import java.util.Arrays;

public class RandomInteger {
	private int[] randomInt;
	private int range;			//1~10까지의 범위 제한
	private int arrSize;		//3개의 랜덤 정수 저장 배열
	
	public RandomInteger(int range, int arrSize) {
		this.range = range;
		this.arrSize = arrSize;
		randomInt = new int[arrSize];
	}
	
	public int rand() {
		return (int)(Math.random()*range)+1;	//랜덤함수 설정 문법
	}
	
	public boolean contain(int n) {				//배열에 중복된 수가 들어있는 지 검사
		boolean isC = true;
		for(int i=0;i<randomInt.length;i++) {
			if(randomInt[i]==n) {
				isC = false;
				break;
			}
		}
		return isC;
	}
	
	public void make() {						//위 contain함수와 같이 활용하여 중복된 수 없이 배열에 수 넣기
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
