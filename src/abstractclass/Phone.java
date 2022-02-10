package abstractclass;

/**
 * 필드, 상수, 구현된 메소드, 추상메소드 포함
 * 
 * @author smart02
 *
 */
public abstract class Phone {
	//필드
	public String owner;
	
	public Phone(String owner) {
		super();
		this.owner = owner;
	}

	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
//	public abstract void call(); // 추상메소드 반드시 들어가야함.
}
