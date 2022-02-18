package collection;

import java.util.*;

public class HashMapExam2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
//HashMap과 공통된 메소드를 사용하기때문.
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 키값 중복
		System.out.println("총 객체수:" + map.size());
		Set<String> keySet = map.keySet();
		
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print(key);
			System.out.print(":");
			System.out.println(map.get(key));
		}

	}

}
