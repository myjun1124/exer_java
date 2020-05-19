package Ex0422;

public class Hanoi {
	public Hanoi() {
	}
	public void run(int tray, char first, char second, char last) {
		//first : 원반들이 있던 탑
		//center : 중간 탑
		//last : 마지막 탑
		if(tray == 1) {
			System.out.println(tray + " : " + first + "->" + last + "로 이동");
		} else {
			run(tray-1, first, last, second);
			//마지막 탑을 보조 탑으로 이용하여 첫 번째 탑에 있는 n-1개의 원반들을 중간 탑으로 이동
			System.out.println(tray + " : " + first + "->" + last + "로 이동");
			run(tray-1, second, first, last);
			//첫 번째 탑을 보조 탑으로 이용하여 중간 탑에 있는 n-1개의 원반들을 마지막 탑으로 이동
		}
	}
}
