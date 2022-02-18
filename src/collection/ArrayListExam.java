package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("JAVA"); // 값추가
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATTS");
		
		//반복으로 배열안의 내용물을 꺼내옴.
		Iterator<String> it = list.iterator(); //반복.
		
		while(it.hasNext()) {//hasnext는  내용이 있는가
			String data = it.next();// 내용을 가져오는 메소드. 해당내용은 이후에 지워짐.
			System.out.println(data);//실제로 arraylist안의 내용이 지워진것은 아님.
		}
		//remove는 실제로 내용이 지워짐.
		
		it = list.iterator(); //한번더 실행하기 위해서 iterator해줘야함.
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
		
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
