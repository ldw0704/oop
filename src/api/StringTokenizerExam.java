package api;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String text = "홍길동,안명진;이순신";
		StringTokenizer token = new StringTokenizer(text, ",;");
		while (token.hasMoreTokens()) {
			System.out.print(token.countTokens());
			System.out.println(token.nextToken());
		}
		
		System.out.println(token.countTokens());
		StringTokenizer token1 = new StringTokenizer(text, ",;");
		while (token1.hasMoreTokens()) {
			System.out.print(token1.countTokens());
			System.out.println(token1.nextToken());
		} // 토큰이 없기때문에 출력되지않는다.
	}

}
