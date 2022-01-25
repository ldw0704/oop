
public class SmartPhoneExam3 {

	public static void main(String[] args) {
//객체선언 new 객체 생성하면 sp(객체)를 인스턴스화 한다.
		SmartPhone sp = new SmartPhone(null, null, null, null, "01021512"); // 생성과 동시에 초기값 주는것.
		SmartPhone sp2 = new SmartPhone();
//객체초기값 - 속성 : 객체명.속성
		sp.caseColor = "white";
		sp2.caseColor = "black";
//객체값출력
		System.out.println("SP휴대폰색상: " + sp.caseColor);
		System.out.println("SP전화번호: " + sp.phoneNumber);
		System.out.println("SP2휴대폰색상: " + sp2.caseColor);
		System.out.println("SP2전화번호: " + sp2.phoneNumber);

//가비지컬렉션 - 메모리 누수 방지
		sp = sp2 = null;
		System.gc();
	}

}
