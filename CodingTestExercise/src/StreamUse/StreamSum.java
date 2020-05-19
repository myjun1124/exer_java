package StreamUse;

import java.util.List;
import java.util.ArrayList;
//import java.util.function.BinaryOperator;

public class StreamSum {
	
	public static void main(String[] args) {
		
		List<Integer> sList = new ArrayList<>();
		List<Integer> oList = new ArrayList<>();
		List<Integer> eList = new ArrayList<>();
		int s = 0;
		for(int i=0;i<101;i++) {
			sList.add(i);
			if(i%2 == 1) {
				oList.add(i);
			} else {
				eList.add(i);
			}
		}
		
		//stream을 사용한 다양한 문법
		s = sList.stream().reduce(0, Integer::sum);
		System.out.println("1~100의 합 : " + s);
		s = sList.stream().filter(i -> i%2==1).reduce(0, Integer::sum);
		//메소드 래퍼런스
		System.out.println("1~100사이의 홀수의 합 : " + s);
		s = sList.stream().filter(i -> i%2==0).reduce(0, (x,y)->x+y);
		//람다식
		System.out.println("1~100사이의 짝수의 합 : " + s);
		
	}

}
