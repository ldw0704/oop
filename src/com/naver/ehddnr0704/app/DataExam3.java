package com.naver.ehddnr0704.app;

import java.util.Date;

/**
 * 출력 : 
 * Wed Feb 09 09:46:32 KST 2022 
 * 2022-02-09
 * 
 * @author smart02
 *
 */
public class DataExam3 {

	public static void main(String[] args) {
		Date now = new Date(); // 자바 sql 패키지와는 다름.
		java.sql.Date now1 = new java.sql.Date(System.currentTimeMillis());
		
		System.out.println(now);
		System.out.println(now1);
	}

}
