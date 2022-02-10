package abstractclass;

public class PhoneExam {

	public static void main(String[] args) {
//		Phone phone = new Phone(); //Phone이 추상클래스라 new 불가 객체생성 불가
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		// 홍길동 출력해 보세요
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		System.out.println(smartphone.owner);
	}

}
