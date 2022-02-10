package abstractclass;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상메소드 abstract , {}몸체없음.
	public abstract void sound();
}
