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
		
		//stream�� ����� �پ��� ����
		s = sList.stream().reduce(0, Integer::sum);
		System.out.println("1~100�� �� : " + s);
		s = sList.stream().filter(i -> i%2==1).reduce(0, Integer::sum);
		//�޼ҵ� ���۷���
		System.out.println("1~100������ Ȧ���� �� : " + s);
		s = sList.stream().filter(i -> i%2==0).reduce(0, (x,y)->x+y);
		//���ٽ�
		System.out.println("1~100������ ¦���� �� : " + s);
		
	}

}
