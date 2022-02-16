package thread;

public class AutoSaveThread extends Thread {

	private void save() {
		System.out.println("작업내용을 저장함");
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			save();
		}
	}

}
