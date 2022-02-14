package api;

import java.io.UnsupportedEncodingException;

public class StringExam {

	public static void main(String[] args) {
		//format: 서식문자열을 이용해서 서식화된 문자열을 반환한다.
		int i =  123456789;
		System.out.println(String.format("%,d", i)); //format(출력형식, 출력하려는변수) ,는 천단위
		System.out.println("-------------");
		
		// split(구분자) 구분자를 이용하여 문자열 배열 생성
		String splitStr = "boo:and:foo";
		String[] strArr = splitStr.split(":");
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println("-------------");

		// startswith: 문자열이 지정한 문자로 시작하는지 판단 같으면 true 반환 아니면 false.대소문자구분
		// endswith: 위의것과 반대.
		String msg = "apple";
		System.out.println(msg.startsWith("a"));
		System.out.println(msg.startsWith("p"));
		System.out.println("-------------");

		// isEmpty : 문자열의 길이가 0인경우에 true를 리턴
		String isEmpty = "";
		System.out.println(isEmpty.isEmpty());
		System.out.println(isEmpty.length() == 0);
		System.out.println("-------------");

		// concat(String)문자열 합치기
		String fStr = "Java";
		String lStr = "Programing";
		System.out.println(fStr.concat(lStr));
		System.out.println(fStr + lStr);
		System.out.println("-------------");

		// 다른 타입을 문자열로 변환 valueOf()
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(1));
		System.out.println(String.valueOf(1.0));
		System.out.println(String.valueOf('a'));
		System.out.println("-------------");

		// trim() 문자열 앞 뒤 공백 제거
		String oldStr1 = "        자바    프로그램        ";
		System.out.println("[DEG][" + oldStr1.trim() + "]");
		System.out.println("-------------");

		// toLowerCase(), toUpperCase()알파벳 대소문자 변경
		String oriStr = "Java Programing";
		System.out.println(oriStr.toLowerCase());
		System.out.println(oriStr.toUpperCase());
		System.out.println("-------------");

		// substring() 문자열 잘라내기, endindex는 0이아닌 1부터 시작함에 주의.
		String ssn = "123456-7890987";
		System.out.println(ssn.substring(0, 6));
		System.out.println(ssn.substring(7));// endindex 미지정시 문자열끝가지 출력
		System.out.println("-------------");

		// replace() 문자열 대치(교체)
		String oldStr = "자바 프로그래밍 자바";
		String newStr = oldStr.replace("자바", "JAVA"); // 모든 해당 문자열을 찾아 교체.
		System.out.println(newStr);
		System.out.println("-------------");

		// length() 문자열의 길이
		String subject2 = "자바 프로그래밍";
		System.out.println(subject2.length());
		System.out.println("-------------");

		// indexOf(찾을문자열) 문자열찾기 charAt(인덱스)
		String subject1 = "자바 프로그래밍 자바";
		int idx = subject1.indexOf("바"); // 없으면 -1 리턴, 중복되는 글자는 왼쪽에서 빠른것만 리턴.
		System.out.println(idx);
		int idx1 = subject1.lastIndexOf("바"); // 오른쪽에서 빠른것 리턴
		System.out.println(idx1);
		System.out.println("-------------");

		// 바이트배열로 변환
		String str = "안녕하세요";// utf-8은 한글자가 3byte
		byte[] bytes1 = str.getBytes(); // 문자열를 바이트배열로
		System.out.println(bytes1.length);
		String str1 = new String(bytes1); // 바이트배열을 문자열로
		System.out.println(str1);
		System.out.println("-------------");

		try {
			byte[] bytes2 = str.getBytes("EUC-KR"); // 인코딩문제로 깨짐
			System.out.println(bytes2.length);
			String str2 = new String(bytes2);
			System.out.println(str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			String str3 = new String(bytes3);
			System.out.println(str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("-------------");
//		byte[] bytes = "문자열".getBytes();
//		System.out.println(new String(bytes));

		// equals(object object)
		// == or equals
		String starVar1 = null;// new String("아아아");
		String starVar2 = "Abc";
		String starVar3 = "abc";
		System.out.println(starVar1 == starVar2);
		System.out.println(starVar2 == starVar3);
//		System.out.println(starVar1.equals(starVar2));
		System.out.println("-------------");
//		System.out.println(starVar1.equals("아아아")); // nullpointexception 발생
		System.out.println("ABC".equals(starVar2)); // 발생하지않음.
		System.out.println("ABC".equalsIgnoreCase(starVar2)); // 대소문자 구분 x

		// charArt(); 인덱스에 해당하는 문자[char]를 리턴한다.
		String subject = "999999-3000000";
		char charVal = subject.charAt(7);// 0부터 시작. 리턴값char -> String 불가
		if ((charVal - '0') % 2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
	}

}
