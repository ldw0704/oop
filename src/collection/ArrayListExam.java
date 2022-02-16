package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("JAVA"); // 값추가
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATTS");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 값 가져오기
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체수: " + list.size()); // 크기
		System.out.println("------------------");

		list.remove(0); // 값지우기
		list.remove("iBATTS");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 값 가져오기
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체수: " + list.size());
		System.out.println("------------------");
	}
}
