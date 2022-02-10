package com.naver.ehddnr0704.app;

/**
 * 하나의 배열로 객체 관리
 * 
 * @author smart02
 *
 */
public class CarExam {

	public static void main(String[] args) {
//		int [] i = new int[2];
//		i[0] = 10;
//		System.out.println(i[0]);
		CarExam[] ce = new CarExam[2];
		ce[0] = new CarExam();
		ce[1] = new CarExam();
//	 	toString이 아래것을 불러옴. 자동으로 붙음. 생략됨
//		getClass().getName() + "@" + Integer.toHexString(hashCode());
//		System.out.println(ce[0].getClass().getName() + "@");
//		System.out.println(ce[0].hashCode());
		System.out.println(ce);
		System.out.println(ce[0]);
		System.out.println(ce[1]);
		

	}

}
