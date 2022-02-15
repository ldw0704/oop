package api;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {

		double num = 1234567.89;

		DecimalFormat df = new DecimalFormat("#,###.0");
		DecimalFormat df2 = new DecimalFormat("000");

		String str = df.format(num); //포맷중요.

		System.out.println(str);

		for (int i = 0; i < 100; i++) {
			String str1 = df2.format(i + 1);
			System.out.println(str1);
//			System.out.println(df2.format(i + 1)); //바로 넣어도됨
		}
	}

}
