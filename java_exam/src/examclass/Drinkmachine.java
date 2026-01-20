package examclass;

import java.util.Scanner;

public class Drinkmachine {

	Drink bacchus;
	Drink monster;
	Drink hotsix;
	Drink milkiss;

	public Drinkmachine(Drink bacchus, Drink monster, Drink hotsix, Drink milkiss) {
		this.bacchus = bacchus;
		this.monster = monster;
		this.hotsix = hotsix;
		this.milkiss = milkiss;
	}

//	메뉴 선택	
	public void selectMenu(int menuNum) {	
//		재고 입력하기
		if (menuNum == 1) {
//			주문하기
		} else if (menuNum == 2) {
//			입고하기
		} else if (menuNum == 3) {
//			재고 확인하기
		} else {
//			종료하기
		}
	}

//	재고 입력하기
	public void currentQuentity() {
		
	}
	

//	주문하기 (제품명, 주문수량)
//	int 구매 금액 반환
	public int orderDrink(String name, int quantity) {
		if (name == "bacchus") {
			this.bacchus.quantity -= quantity;
			return this.bacchus.price * quantity;
		} else if (name == "monster") {
			return this.monster.price * quantity;
		} else if (name == "hotsix") {
			return this.hotsix.price * quantity;
		} else if (name == "milkiss") {
			return this.milkiss.price * quantity;
		} else {
			System.out.println("없는 제품입니다");
			return 0;
		}
	}

//	입고하기 (제품명, 입고수량)
//	void
	public void receiveDrink(int menu, int quantity) {
		if (menu == 1) {
			System.out.println("입고 전 박카스 재고 : " + this.bacchus.quantity);
			this.bacchus.quantity += quantity;
			System.out.println("입고 후 박카스 재고 : " + this.bacchus.quantity);
		} else if (menu == 2) {
			System.out.println("입고 전 몬스터 재고 : " + this.monster.quantity);
			this.monster.quantity += quantity;
			System.out.println("입고 후 몬스터 재고 : " + this.monster.quantity);
		} else if (menu == 2) {
			System.out.println("입고 전 핫식스 재고 : " + this.hotsix.quantity);
			this.hotsix.quantity += quantity;
			System.out.println("입고 후 핫식스 재고 : " + this.hotsix.quantity);
		} else {
			System.out.println("입고 전 밀키스 재고 : " + this.milkiss.quantity);
			this.milkiss.quantity += quantity;
			System.out.println("입고 후 밀키스 재고 : " + this.milkiss.quantity);
		}
	}

//	모든 상품의 재고 출력
//	void
	public void quantityPrint() {
		
	}
	
	public static void main(String[] args) {
		
	}
}
