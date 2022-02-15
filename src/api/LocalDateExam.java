package api;

import java.time.LocalDate;

public class LocalDateExam {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now(); // 1.8버전 이상 연월일요일까지 가능.
		System.out.println(now);
		LocalDate now2 = LocalDate.of(2021, 12, 31); // 직접 특정 연월일 입력
		System.out.println(now2.getDayOfWeek());

	}

}
