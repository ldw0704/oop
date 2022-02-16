package thread;

public class ThreadA extends Thread {

	public ThreadA() {
		setName("ThreadA"); //setName을 통해 쓰레드이름을 줄수잇다. 상속한 메소드 사용
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
