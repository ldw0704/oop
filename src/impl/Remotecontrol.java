package impl;
/**
 * 인터페이스 구성은 상수. (디폴트메소드, 정적메소드 자바 1.8이상만) 추상메소드만 사용가능하다.
 * @author smart02
 *
 */
public interface Remotecontrol {
	//인터페이스는 여러개를 상속받을수 있다.
	public int MAX_VOLUME = 10; //인터페이스는 변수선언 불가 -자동으로 public static final이 붙음.
	public final int MIN_VOLUME = 0;  
	
	public void turnOn(); // 자동으로 추상메소드(인터페이스라서) abstract생략해도.
	public void turnOff();
	public void setVolume(int volume);
	
}
