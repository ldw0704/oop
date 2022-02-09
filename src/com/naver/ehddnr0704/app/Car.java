package com.naver.ehddnr0704.app;

public class Car {

	Tire t1; // static 은 미리 만들어져있음. 공용.
	Tire t2;

	public Car() { // 파라미터가없으면
		t1 = new HankookTire();
		t2 = new KumhoTire(); // 만들면 상속하는 클래스도 자동으로 만들어진다.

	}

	public static void main(String[] args) {
//		com.hankook.Tire tire = new com.hankook.Tire(); 
//		Tire tire = new Tire(); // import 사용방법

		Car car = new Car();
		car.t1.setInch(15);
		System.out.println(car.t1.getInch());

		Car car2 = new Car();
		car2.t1.setInch(20);
		System.out.println(car2.t1.getInch());

//		Car.t2.setInch(23);
//		System.out.println(Car.t2.getInch());
		// static은 클래스이름.Xx로 사용가능.

	}
}
