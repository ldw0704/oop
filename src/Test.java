import java.sql.Date;

public class Test {

	public static void main(String[] args) {
		// java.sql.Date
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);

		// java.util.Date - 같은이름의 클래스를 사용할때. 하나는 임포트. 하나는 패캐지이름.클래스 사용. 안헷갈리도록
		java.util.Date date2 = new java.util.Date(System.currentTimeMillis());
		System.out.println(date2);
	}

}
