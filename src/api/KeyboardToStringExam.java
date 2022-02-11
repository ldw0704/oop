package api;

import java.io.IOException;

public class KeyboardToStringExam {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100]; // buffer크기
		System.out.println("입력:");

		int readByteNo = System.in.read(bytes); // 입력
		System.out.println(readByteNo);
		String str = new String(bytes, 0, readByteNo - 2); 
		// -2는 /n(줄바꿈)/r(제일앞으로) : (엔터친것)을 문자열뒤에 붙기 때문
		System.out.println("[" + str + "]");
	}
}
