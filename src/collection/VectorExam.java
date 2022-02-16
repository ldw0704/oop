package collection;

import java.util.Vector;
import java.util.List;

public class VectorExam {

	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		System.out.println("용량:"+list.capacity()); //백터는 미리 10개가 만들어짐.
		list.add("JAVA"); // 값추가
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); //2번배열에 추가. 그자리에 있는 값은밀려남.
		list.add("iBATTS");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 값 가져오기
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체수: " + list.size()); // 크기
		System.out.println("------------------");

		list.remove(0); // 0번 배열값 지우기
		list.remove("iBATTS"); // 해당이름 지우기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 값 가져오기
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체수: " + list.size());
		System.out.println("------------------");
	}
}
