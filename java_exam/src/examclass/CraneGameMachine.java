package examclass;

import java.util.Scanner;

public class CraneGameMachine {
	static boolean insertCoin = true;
	static int dolls;
	
	public static void insertCoin() {
		Scanner sc = new Scanner(System.in);
		CraneGameMachine game = new CraneGameMachine();
		
		System.out.print("인형뽑기 게임기를 시작하시겠습니까? (o: 시작, x: 종료) : ");
		String yesOrNo = sc.next();
		
		if (!yesOrNo.equals("o")) {
			insertCoin = !insertCoin;
		} 
		if (insertCoin == true) {
			System.out.println("게임을 실행합니다");
			doGame();
		} else {
			System.out.println("게임을 실행하지 않습니다");
		}
	}
	
	public static int doGame() {
		
		dolls = (int)(Math.random() * 2);
		System.out.println(dolls);
		if (dolls == 1) {
			System.out.println("인형을 뽑았습니다");
			return 1;
		} else {			
			System.out.println("인형을 뽑지 못했습니다");
			return 0;
		}
	}
	
	public static void main(String[] arg) {
		insertCoin();
		
		
		
	}
	
}
