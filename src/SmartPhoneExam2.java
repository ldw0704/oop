
public class SmartPhoneExam2 {

	public static void main(String[] args) {
//객체선언 new 객체 생성하면 sp(객체)를 인스턴스화 한다.
		SmartPhone sp = new SmartPhone(); // 디폴트 생성자가 호출됨.
//객체초기값 - 속성 : 객체명.속성
		sp.caseColor = "white";
//객체값출력
		System.out.println("휴대폰색상: " + sp.caseColor);
		System.out.println("전화번호: " + sp.phoneNumber);
//객체메소드호출 - 객체명.메소드();
		sp.TakingPictures();
		sp.MakeACall("00010101");
		sp.playApp("카카오톡");
//가비지컬렉션 - 메모리 누수 방지
		sp = null;
		System.gc();
	}

}
