package thread;

public class DaemonExam {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setDaemon(true); //데몬스레드로 만듬, 메인스레드가 종료될때 자식스레드도 같이 종료됨.
		ast.start(); //run 메소드호출
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인스레드 종료"); 
	}
//3초후 메인스레드 종료.  자식스레드는 데몬스레드가 아니면 무한루프이기때문에 계속 출력됨
}
