package api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		now.setMonth(11);
		System.out.println(now.getMonth() + 1);// 0월부터 11월까지 잇다고 인식함.

		SimpleDateFormat format = new SimpleDateFormat("yyyy년 mm월 dd일 HH시 mm분 ss초");
		// 4글자 년, 2글자 월, 2글자 일, 2글자 시, 2글자 분, 2글자 초 | HH 24시간 hh 12시간
		String nowStr = format.format(now);// String을 리턴
		System.out.println(nowStr);

	}

}
