package excp;

/**
 * try{예외발생코드}catch(Exception){예외처리코드}finally{무시하고 수행}
 * 
 * @author smart02
 *
 */
public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		int value1 = 0;
		try {
			value1 = Integer.parseInt(data1);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			System.out.println("예외가 발생하더라도 무조건 실행됩니다.");
		} // 예외가 없더라도 finally는 실행됨
		System.out.println(value1);
//런타임에러 - 실행중에. 코드상에선 문제가 나타나지않음.
	}

}
