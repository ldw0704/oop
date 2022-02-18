package collection;

import java.util.*;

public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
//		List<String> set = new ArrayList<String>(); // 중복값 허용
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/Jstp");
		set.add("Java"); //set 인터페이스는 중복값을 허용하지 않는다.

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}

	}

}
