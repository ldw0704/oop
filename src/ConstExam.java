
public class ConstExam {

	public static void main(String[] args) {
		Const c = new Const(); // new 생성자 - 클래스명과 동일
		Const c2 = new Const(10,"abc");
		new Const(10, "abc");
		c.a = 10;
		c2.a = 20;
		System.out.println(c.a);
		System.out.println(c2.a);

//		c.print(10);
//		c.print(10.1);
//		c.print("ㅗㅎ");
		c.print(10, 10.1,"ㅗㅎ");
		
	}

}
