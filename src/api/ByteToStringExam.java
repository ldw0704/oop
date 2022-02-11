package api;

public class ByteToStringExam {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(bytes);
		String str2 = new String(bytes, 6, 4); // 길이가 넘어가면 에러.
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
