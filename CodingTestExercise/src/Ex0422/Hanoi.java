package Ex0422;

public class Hanoi {
	public Hanoi() {
	}
	public void run(int tray, char first, char second, char last) {
		//first : ���ݵ��� �ִ� ž
		//center : �߰� ž
		//last : ������ ž
		if(tray == 1) {
			System.out.println(tray + " : " + first + "->" + last + "�� �̵�");
		} else {
			run(tray-1, first, last, second);
			//������ ž�� ���� ž���� �̿��Ͽ� ù ��° ž�� �ִ� n-1���� ���ݵ��� �߰� ž���� �̵�
			System.out.println(tray + " : " + first + "->" + last + "�� �̵�");
			run(tray-1, second, first, last);
			//ù ��° ž�� ���� ž���� �̿��Ͽ� �߰� ž�� �ִ� n-1���� ���ݵ��� ������ ž���� �̵�
		}
	}
}
