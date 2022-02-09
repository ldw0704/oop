package com.naver.ehddnr0704.app;

// 명시하지 않아도 object(객체 최상위)는 상속함.
public class ConstP extends Object {
	public ConstP() {
//		super(); // 안써도 문제는 없음. 반드시 위에 잇어야함(this포함)

		System.out.println("ConstP생성자");
	}

	public ConstP(String msg) {
		System.out.println(msg);
	}
}
