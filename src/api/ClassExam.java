package api;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassExam ce = new ClassExam();
		System.out.println(ce.getClass());
		System.out.println(ce.getClass().getName()); //이름만 나옴.
		Class clazz = Class.forName("api.Counter"); // Class.forName: 해당명 클래스를 읽음
		System.out.println(clazz.getName());
	}

}
