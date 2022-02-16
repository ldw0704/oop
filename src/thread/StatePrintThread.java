package thread;

public class StatePrintThread extends Thread {

	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) { // 스레드가 종료되면 멈춤
			Thread.State state = targetThread.getState();
			// 내부클래스 - 클래스안 클래스.
			System.out.println("타겟 스레드 상태 : " + state);

			if (state == Thread.State.NEW) { // 타겟스레드가 생성되었는지 확인
				targetThread.start();
			}
			if (state == Thread.State.TERMINATED) { // 스레드가 종료되엇는지
				break; // 쓰레드 멈춤
			}
			try {
				Thread.sleep(500); //0.5초 대기
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

}
