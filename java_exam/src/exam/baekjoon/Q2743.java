package exam.baekjoon;

import java.util.Iterator;
import java.util.Scanner;

public class Q2743 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		no. 2743
//		System.out.println("단어를 입력해주세요: ");
//		String inputword = sc.nextLine();
//		System.out.println(inputword.length());

//		no. 11654
//		System.out.println("문자 한자리를 입력해 주세요: ");
//		char str = sc.next().charAt(0);
//		System.out.println((int) str);

//		no. 11720
//		System.out.println("숫자를 입력해주세요: ");
//		String strNum = sc.nextLine();

		/*
		 * 하나 문자열을 자르고 정수로 변환해서 sum에 더하기를 문자열의 길이만큼 반복
		 */
//		int num = 0;
//		int sum = 0;
//		for (int i = 0; i < strNum.length(); i++) {
//			num = Integer.parseInt(strNum.charAt(i)+"");
//			sum += num;
//		}
//		System.out.println(sum);

//		no. 10809
//		문제 다시 읽어보기

//		no. 1152
//		System.out.println("영문장을 입력하세요: ");
//		String str = sc.nextLine();
//		String[] strArray = str.split(" ");
//		System.out.println(strArray.length);

//		no. 2908
		System.out.println("숫자 3자리를 입력하세요: ");
		String strNum1 = sc.nextLine();
		String strNum2 = sc.nextLine();

		/*
		 * 숫자 문자열을 입력 받아서 각각 배열에 저장
		 */
		int num1;
		int num2;
		String[] numArray1 = new String[3];
		String[] numArray2 = new String[3];
		String concatNum1 = null;
		String concatNum2 = null;
		for (int i = 0; i < strNum1.length(); i++) {
			numArray1[i] = strNum1.charAt(i) + "";
			numArray2[i] = strNum2.charAt(i) + "";
		}
		for (int i = 2; i <= 0; i--) {
			concatNum1.concat(numArray1[i]);
			concatNum2.concat(numArray2[i]);

		}
//		if (Integer.parseInt(concatNum1) > Integer.parseInt(concatNum2)) {
//			System.out.println(concatNum1);
//		} else {
//			System.out.println(concatNum2);
//		}
		System.out.println(concatNum1);
		System.out.println(concatNum2);
	}
}
