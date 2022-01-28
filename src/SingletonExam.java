
public class SingletonExam {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance(); // 캡슐화. 보여줄것만 보여줌.
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2) {
			System.out.println("같은 Singleton객체 입니다.");
		} else {
			System.out.println("다른 Singleton객체 입니다.");
		}
	}

}
