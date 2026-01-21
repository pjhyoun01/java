package examclass;

import java.util.Scanner;

public class Drinkmachine {
	static Drink bacchus;
	static Drink monster;
	static Drink hotsix;
	static Drink milkiss;
	static Scanner sc = new Scanner(System.in);

	public static void plusQuantity() {
		System.out.println("초기 재고를 입력하세요. (박카스, 몬스터, 핫식스, 밀키스 순서대로): ");
		int bq = sc.nextInt();
		int mq = sc.nextInt();
		int hq = sc.nextInt();
		int miq = sc.nextInt();

		bacchus = new Drink("bacchus", bq, 1_000);
		monster = new Drink("monster", mq, 2_100);
		hotsix = new Drink("hotsix", hq, 1_200);
		milkiss = new Drink("milkiss", miq, 1_500);

		System.out.println("재고가 설정 되었습니다.");
		printQuantity(); 
	}

	public static void selectMenu() {
		while (true) {
			System.out.println("\n--- 자판기 메뉴 ---");
			System.out.println("1. 주문 \n2. 입고 \n3. 재고 출력 \n4. 종료");
			System.out.print("메뉴 번호를 선택해 주세요 : ");
			int menuNum = sc.nextInt();

			if (menuNum == 1) {
				orderDrink();
			} else if (menuNum == 2) {
				warehousingDrink();
			} else if (menuNum == 3) {
				printQuantity();
			} else {
				System.out.println("자판기를 종료합니다.");
				break;
			}
		}
	}

	public static void orderDrink() {
		System.out.println("주문할 음료 번호를 선택하세요 (1.박카스 2.몬스터 3.핫식스 4.밀키스): ");
		int choice = sc.nextInt();
		System.out.print("수량을 입력하세요: ");
		int orderQuantity = sc.nextInt();

		Drink selected = null;
		if (choice == 1)
			selected = bacchus;
		else if (choice == 2)
			selected = monster;
		else if (choice == 3)
			selected = hotsix;
		else if (choice == 4)
			selected = milkiss;

		if (selected != null) {
			if (selected.quantity >= orderQuantity) {
				selected.quantity -= orderQuantity;
				int totalPrice = selected.price * orderQuantity;
				System.out.println(selected.name + " " + orderQuantity + "개의 가격은 " + totalPrice + "원입니다.");
			} else {
				System.out.println("재고가 부족합니다. (현재 재고: " + selected.quantity + ")");
			}
		} else {
			System.out.println("잘못된 선택입니다.");
		}
	}

	public static void warehousingDrink() {
		System.out.println("1. bacchus, 2. monster, 3. hotsix, 4. milkiss");
		System.out.print("입고 할 제품 번호와 수량을 입력하세요: ");
		int warehousingNum = sc.nextInt();
		int warehousingQuantity = sc.nextInt();

		if (warehousingNum == 1) {
			bacchus.quantity += warehousingQuantity;
			System.out.println("박카스 재고 추가 완료.\n현재 재고 : " +bacchus.quantity);
		} else if (warehousingNum == 2) {
			monster.quantity += warehousingQuantity;
			System.out.println("몬스터 재고 추가 완료.\n현재 재고 : " + monster.quantity);
		} else if (warehousingNum == 3) {
			hotsix.quantity += warehousingQuantity;
			System.out.println("핫식스 재고 추가 완료.\n현재 재고 : " +hotsix.quantity);
		} else if (warehousingNum == 4) {
			milkiss.quantity += warehousingQuantity;
			System.out.println("밀키스 재고 추가 완료.\n현재 재고 : " +milkiss.quantity);
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public static void printQuantity() {
		System.out.println("\n[현재 재고 상태]");
		System.out.println(bacchus.name + ": " + bacchus.quantity);
		System.out.println(monster.name + ": " + monster.quantity);
		System.out.println(hotsix.name + ": " + hotsix.quantity);
		System.out.println(milkiss.name + ": " + milkiss.quantity);
	}

	public static void main(String[] args) {
		plusQuantity();
		selectMenu();
	}
}