package api;

import common.JavaUtil;

public class MathExam {

	public static void main(String[] args) {
		// 10 ~20사이
		System.out.println((int)(Math.random()*11) + 10);

		String str = null;
//		System.out.println((str ==null)? "".length():str.length());
		System.out.println(JavaUtil.nullToBlank(str).length());
		System.out.println(JavaUtil.round(Math.random(), 2));

		System.out.println(Math.round(Math.random() * 1000 / 1000.));// 실수출력위해 실수로 나눔
		System.out.println(Math.random());
	}
}
