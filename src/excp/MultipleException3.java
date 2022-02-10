package excp;

public class MultipleException3 {

	public static void main(String[] args) {
		try {
			Class.forName(""); // 클래스이름 적어야함.

			Thread.sleep(100); // add catch clause
		} catch (Exception e) {
			System.out.println("ClassNotFoundeException");
		}
//		} catch (InterruptedException e) {//exception 에서 다 처리하기때문. 순서에따라 달라짐.			
//			System.out.println("InterruptedException");
//		} 

	}
}