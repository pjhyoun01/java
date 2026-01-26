package com.ktdsuniversity.edu.restaurant;

public class Restaurant {
	private int hungerLevelPerRest;
	private double drunkLevelPerRest;
	private Menu[] menus;

	public Restaurant(int hungerLevelPerRest, double drunkLevelPerRest, Menu[] menus) {
		this.hungerLevelPerRest = hungerLevelPerRest;
		this.drunkLevelPerRest = drunkLevelPerRest;
		this.menus = menus;
	}

	public void judgeOrder(Customer cust, Menu menu, int quantity) {
		int canOrderQuantity = quantity;

		if (cust.getWallet() < menu.getPrice() * canOrderQuantity) {
			canOrderQuantity = cust.getWallet() / menu.getPrice();
			if (menu.isFood()) {
				System.out.println("돈이 부족하여 " + menu.getName() + " " + canOrderQuantity + "개만 주문하였습니다.");				
			} else {
				System.out.println("돈이 부족하여 " + menu.getName() + " " + canOrderQuantity + "병만 주문하였습니다.");				
			}
		}

		if (canOrderQuantity <= 0)
			return;

		if (menu.isFood()) {
			int canTake = hungerLevelPerRest - cust.getCurrentHungerLevel();
			int requested = menu.getWeightPerMenu() * canOrderQuantity;
			if (requested > canTake) {
				canOrderQuantity = canTake / menu.getWeightPerMenu();
				if (canOrderQuantity > 0) {
					System.out.println("\n식당 배부름 기준에 따라 " + canOrderQuantity + "개만 주문 했습니다.");
				} else {
					System.out.println("\n식당 배부름 기준을 초과 하여 " + menu.getName() + "을/를 주문하지 못했습니다.");
				}
			}
			cust.increaseHunger(menu.getWeightPerMenu() * canOrderQuantity);
		} else {
			double oneBac = cust.calcBAC(menu);
			double canDrinkBac = drunkLevelPerRest - cust.getCurrentDrunkLevel();
			if (oneBac * canOrderQuantity > canDrinkBac) {
				canOrderQuantity = (int) (canDrinkBac / oneBac);
				if (canOrderQuantity > 0) {
					System.out.println("\n혈중 알코올 농도 기준에 따라 " + canOrderQuantity + "병만 주문 했습니다.");
				} else {
					System.out.println("\n혈중 알코올 농도 기준을 초과 하여 " + menu.getName() + "을/를 주문하지 못했습니다.");
				}
			}
			cust.increaseDrunk(oneBac * canOrderQuantity);
		}
		if (canOrderQuantity > 0) {
			cust.setWallet(cust.getWallet() - (menu.getPrice() * canOrderQuantity));
			System.out.println(menu.getName() + " " + canOrderQuantity + "개 주문 완료");
		}
	}

	public void printMenuAndDrink() {
		System.out.println("-------- 메뉴 --------");
		for (int i = 0; i < menus.length; i++) {
			System.out.print((i + 1) + ". " + menus[i].getName() + "   \t");
			if (menus[i].isFood()) {
				System.out.println(menus[i].getWeightPerMenu() + "g");
			} else {
				System.out.println(menus[i].getWeightPerMenu() + "ml " + menus[i].getPercentagePerDrink() + "%");
			}
		}
		System.out.println();
	}
}