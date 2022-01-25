/**
 * 스마트폰 클래스
 * 
 * @author smart19
 *
 */
public class SmartPhone {
	// 멤버변수
	String caseColor; // 색상
	String camerePixel; // 카메라 화소
	String lcdSize; // 화면크기
	String modelName; // 모델명
	String phoneNumber;// 전화번호

	// 멤버메소드
	// 디폴트 생성자 - 변수 초기화 0,NULL ,source - generate constructor from superclass

	public SmartPhone() {
		System.out.println("디폴트 생성자를 호출했습니다.");
	}

	public SmartPhone(String caseColor, String camerePixel, String lcdSize, String modelName, String phoneNumber) {
		this.caseColor = caseColor;
		this.camerePixel = camerePixel; //this : 호출한 변수명
		this.lcdSize = lcdSize;
		this.modelName = modelName;
		this.phoneNumber = phoneNumber; // 생성하면서 바로 값 줄 수 있게 하는 생성자
	} // source(빈화면 우클릭) - generate constructor from field
		// 이걸 생성하면 디폴트 생성자를 자동으로 생성하지않는다.( 디폴트 생성자 하나 만들어 두는것을 권장함)

	void TakingPictures() {
		System.out.println("사진을 찍다");
	}// 사진찍기

	void MakeACall(String tophoneNumber) {
		System.out.println(tophoneNumber + "번호로 전화를 겁니다.");
	}// 전화걸기

	void playApp(String appName) {
		System.out.println(appName + "앱을 실행합니다.");
	}// 앱실행
}
