package impl;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 캐스팅
 * @author smart02
 *
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); //<제너릭>1
		al.add("hi");
		al.add("JAVA");
		Iterator<String> it = al.iterator(); // 자바유틸에 있는것 가져오기 swing때문에
		while(it.hasNext()) {
			String str = it.next(); //캐스팅
			System.out.println(str);
		}
	}

}
