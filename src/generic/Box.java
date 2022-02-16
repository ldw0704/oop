package generic;

public class Box<T> {
	// 제네릭 <T> 변경시 T모두 변경됨, 자바 1.5버전
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}
