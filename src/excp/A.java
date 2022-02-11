package excp;

public class A {

	public void throwMethod() throws InterruptedException { 
		Thread.sleep(0);
		//throws는 호출한 클래스에서 예외처리를 한다.
	}

}
