package examclass;

import java.util.Scanner;

public class CoffeeShop {
	Coffee iceAmericano;
	Coffee hotAmericano;

	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
	}

	public int orderCoffee(int menu, int quantity) {
		if (menu == 1) {
			System.out.println(this.iceAmericano.name);
			return this.iceAmericano.price * quantity;
		}
		System.out.println(this.hotAmericano.name);
		return this.hotAmericano.price * quantity;
	}

	public static void main(String[] arg) {
		Coffee ice = new Coffee("아아", 2_500);
		Coffee hot = new Coffee("뜨아", 2_000);

		CoffeeShop cs = new CoffeeShop(ice, hot);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("따뜻한 아메리카노는 0번 차가운 아메리카노는 1번 : ");
		int iceOrHot = sc.nextInt();
		System.out.print("몇 잔 주문하시겠습니까? : ");
		int coffeeCount = sc.nextInt();
		int price = cs.orderCoffee(iceOrHot, coffeeCount);
		System.out.println("가격은 " + price + "원 입니다");
		

	}
}
