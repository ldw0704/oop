import java.awt.Color;

public class ConstExam2 {

	public static void main(String[] args) {
		// static은 new로 만들필요없다. 미리만들어져있음.
		Const.a = 10; // 클래스 이름에 바로 접근가능. 클래스가 로딩되면 바로 가져와 사용가능.
		Const.a = 20;
		System.out.println(Const.a);
		Const.print(Const.a); // new 만들필요없음. static아 아니면 아에 안뜸
		System.out.println(Color.red);// static에 미리배정.
		System.out.println(Math.abs(-10));// static에 미리배정.
	}

}
