package com.ktdsuniversity.edu.file;

public class Recursive {

	public void print(int number) {
		System.out.println("출력합니다. - " + number);
		if (number > 0) {
			print(number - 1);			
//			System.out.println(number + "스택 실행 완료");
		}
	}
	public int printSum(int number) {
		if (number == 1) {
			return 1;
		}
		return number + printSum(number - 1);
	}
	
	public static void main(String[] args) {
		Recursive r = new Recursive();
//		r.print(2000);
		
		System.out.println(r.printSum(5));
	}
}
