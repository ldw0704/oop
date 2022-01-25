
public class SmartPhoneExam {

	public static void main(String[] args) {
//객체선언
		SmartPhone sp = null;
//객체생성 SmartPhone(); 디플트생성자
		sp = new SmartPhone();
//객체초기값 - 속성 : 객체명.속성
		sp.caseColor = "white";
//객체값출력
		System.out.println("휴대폰색상: " + sp.caseColor);
//객체메소드호출 - 객체명.메소드();
		sp.TakingPictures();
//가비지컬렉션 - 메모리 누수 방지
		sp = null;
		System.gc();
	}

}
