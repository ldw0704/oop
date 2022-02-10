package excp;

public class MultipleException2 {

	public static void main(String[] args) {
		try {
			Class.forName("");

			Thread.sleep(100); // add exception to existing catch clause
		} catch (ClassNotFoundException | InterruptedException e) {
			System.out.println("ClassNotFoundeException");
		}

	}

}
