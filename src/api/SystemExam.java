package api;

import java.sql.Date;

/**
 * 시스템 클래스
 * @author smart02
 *
 */
public class SystemExam {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();//타임스탬프: 1970-1-1 기준으로 초단위로 표현.
		System.out.println(now);
		System.out.println(new Date(0));//초값까지는 util패키지

	}

}
