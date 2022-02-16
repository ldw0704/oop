package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar rightNow = Calendar.getInstance(); // 캘린더는 getinstance 사용
		Calendar rightNow2 = Calendar.getInstance();
		
		System.out.println(format.format(rightNow.getTime()));

		rightNow.add(Calendar.SECOND, 60);
		System.out.println(format.format(rightNow.getTime()));
		rightNow2.roll(Calendar.SECOND, 1); //다른 영역에는 영향을 주지않는다. 대상필드만 영향
		System.out.println(format.format(rightNow2.getTime()));
		
		System.out.println(rightNow.get(Calendar.MONTH) + 1+"월");

		rightNow.set(2021, 11, 31); // 0월부터 11월까지 있음, 11 =(12-1), 12입력시 연도가 바뀜
		boolean tf1 = rightNow.before(rightNow2); // before,after 전후관계 true/false로
		System.out.println(tf1);
//		System.out.println(rightNow.getTime());// 현재
		System.out.println(format.format(rightNow.getTime()));

//		rightNow.add(Calendar.SECOND, -120);//초단위 더하기
//		rightNow.add(Calendar.DAY_OF_MONTH, 1);// 일단위		
		rightNow.add(Calendar.MONTH, 1);
		System.out.println(format.format(rightNow.getTime()));// 120초 추가된날짜

	}

}
