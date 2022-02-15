package api;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
//		Locale
		// Asia/Seoul
		TimeZone timeZon = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(); // new 사용안함.
		System.out.println(now.get(Calendar.HOUR)); //상수값. Calendar.상수 사용해도됨.
		String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
//			System.out.println(id);
		}
		// ids를 추출해 id에 대입. 확장 for문
	}

}
