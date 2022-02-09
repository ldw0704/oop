package com.naver.ehddnr0704.app;

public class MethodC extends MethodP {
	public MethodC() {
		super();// .methodP();는 메소드일대. 생성자가 되면 필요없음
		System.out.println("methodC");
	}

// 생성자는 클래스이름과 동일해야한다. 반환값이 없다.
	public void methodC2() {

	}

	@Override
	public void show() {
		System.out.println("override");
	}

}
