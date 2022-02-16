package thread;

public class PriorityExam {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new CalcThread("쓰레드" + i);
			if (i != 9) {
				t.setPriority(Thread.MIN_PRIORITY);
			} else {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
		}
	}

}
