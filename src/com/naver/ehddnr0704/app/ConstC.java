package com.naver.ehddnr0704.app;

public class ConstC extends ConstP {
	public ConstC() {
		super("문자열"); 
		// super(); 부모생성자 호출 나자신 this | ConstP();를 호출함
		// 파라미터를 줄경우 해당 생성자로(여기는 오버로딩된 ConstP();호출)
		System.out.println("ConstC생성자");
	}

	
}
