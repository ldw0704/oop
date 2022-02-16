package thread;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

//동기화 메소드 public (synchronized) void
	public void setMemory(int memory) {
		synchronized (this) {	//동기화 블럭 synchronized(파라미터){}	
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
	}

}
