package Ex0422;

public class HanoiMain {
	public static void main(String[] args) {
		Hanoi ha = new Hanoi();
		ha.run(3, 'a', 'b', 'c');
	}
}
