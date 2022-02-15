package api;

import java.util.Arrays;

public class ArraysCopyExam {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'}; //정적메소드라 바로 사용가능.
		char[] arr2 = Arrays.copyOf(arr1, 5); // (복사할 배열, 배열수) 넘치는 칸은 공백, null
		System.out.println(Arrays.toString(arr1)); //원본
		System.out.println(Arrays.toString(arr2)); //복사본
		
	}
}
