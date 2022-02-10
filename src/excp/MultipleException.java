package excp;

public class MultipleException {

	public static void main(String[] args) {
		try {
			Class.forName(""); // 클래스이름 적어야함.

			Thread.sleep(100); // add catch clause
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundeException");
		} catch (InterruptedException e) {			
			System.out.println("InterruptedException");
		} 

	}

}
