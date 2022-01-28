
public class Const {

	static int a; //static 공통 메모리 영역.공통된 변수
	String b;

	// 디폴트생성자 void - 생성자는 대부분 초기화 목적. 웹할때는 안씀
	public Const() { // 소스 - 수퍼클래스
//		this(10, "abc"); // 생성자에서 다른 생성자를 호출할때, 파라미터값에따라 호출됨. 반드시 위에 위치해야함.(생성자바로밑)
		this("Abc", 10);
		System.out.println("아래 다른생성자 호출에 에러가 납니다.");
		
	}

	// 오버로딩 - 타입이 다르거나 파라미터수 혹은 순서가 다르면 함수명 중복사용가능(한개의 함수명으로 다양하게 사용가능).자바만가능
	public Const(int a, String b) { // 소스 - 유징필드
		this.a = a;
		this.b = b;
	}

	public Const(String b, int a) { // 소스 - 유징필드
		this.a = a;
		this.b = b;
	}

	public Const(String b) {
		this.b = b;
	}

	static void print(int i) {
		System.out.println("출력값 INT: " + i);
	}

	void print(Double i) {
		System.out.println("출력값 DOUBLE: " + i);
	}

	void print(String i) {
		System.out.println("출력값 STRING: " + i);
	}

	public void print(int i, double d, String s) {
		/**
		 * ==, equal, instanceof(현재클래스에서 만들어진 객체인지 물어봄)
		 */
		print(i);
		print(d);
		print(s);
//		if(Integer.valueOf(i) instanceof Integer) {
//			print(i);
//		}
//		if(Double.valueOf(d) instanceof Double) {
//			print(d);
//		}
//		if(s instanceof String) {
//			print(s);
//		}

	}

//	public Const() {
//	} // 중괄호 여부 중요
//
//	public Const(int a, String b) {
//		this.a = a; // this 필드에 입력
//		this.b = b;
//	}
}
