package common;

public class JavaUtil {
	/**
	 * Round함수(반올림)
	 * 
	 * @param double 실수값
	 * @param int    정수값
	 * @return
	 */
	public static double round(double d, int i) {
//Math.pow는 제곱.
		return Math.round(d * Math.pow(10, i)) / Math.pow(10, i);
	}
/**
 * 문자열이 null일때 빈값으로 처리
 * @param 문자열
 * @return null 일때 빈값 or null이 아닐때 문자열
 */
	public static String nullToBlank(String s) {
		if(s == null){
			s = "";
		}
		return s;
	}
}
