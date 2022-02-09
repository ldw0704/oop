package com.naver.ehddnr0704.app;
//final 접근지정자는 상속할 수 없음. 클래스 메소드 모두.
public class MethodP {
	public MethodP() {
		System.out.println("methodP");
	}

	// 메소드는 반환값이 있다.
	void show() {
		System.out.println("parent"); 
		// 자식 접근지정자는 부모 접근지정자를 포함해야한다.
		// 부모 접근지정자는 자식 접근지정자의 필요조건이다.
	}
}
