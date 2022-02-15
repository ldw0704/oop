package api;

import java.util.Iterator;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		// 10~20
		System.out.println(random.nextInt(11) + 10);

		System.out.println(System.currentTimeMillis());
		System.out.println(Math.abs(random.nextInt())); // 랜덤클래스. 난수 Math.abs절대값
//		for(int i = 0; i < 100; i++)
//			System.out.println(random.nextInt(11)); //nextInt 0부터 패러미터값사이
		System.out.println(Math.abs(random.nextInt(11)));
	}

}
