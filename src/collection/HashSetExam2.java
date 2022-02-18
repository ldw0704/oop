package collection;

import java.util.*;

public class HashSetExam2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>(); // 컬렉션프레임워크는 객체가 들억야함. 인트는 integer

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 20));

		System.out.println("총 객체수 : " + set.size());//객체수size
	}

}
