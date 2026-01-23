package com.ktdsuniversity.edu.restaurant;

public class Menu {

	private String menuName;
	private int orderCountPermenu;
	private int weightPerMenu;

	private String drinkName;
	private int capacityPerDrink;
	private int percentagePerDrink;
	private int orderCountPerDrink;

	Menu[] menus;

	public Menu(String menuName, int orderCountPermenu, int weightPerMenu, String drinkName, int capacityPerDrink,
			int percentagePerDrink, int orderCountPerDrink, Menu[] menus) {
		this.menuName = menuName;
		this.orderCountPermenu = orderCountPermenu;
		this.weightPerMenu = weightPerMenu;
		this.drinkName = drinkName;
		this.capacityPerDrink = capacityPerDrink;
		this.percentagePerDrink = percentagePerDrink;
		this.orderCountPerDrink = orderCountPerDrink;
		this.menus = menus;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getOrderCountPermenu() {
		return orderCountPermenu;
	}

	public void setOrderCountPermenu(int orderCountPermenu) {
		this.orderCountPermenu = orderCountPermenu;
	}

	public int getWeightPerMenu() {
		return weightPerMenu;
	}

	public void setWeightPerMenu(int weightPerMenu) {
		this.weightPerMenu = weightPerMenu;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public int getCapacityPerDrink() {
		return capacityPerDrink;
	}

	public void setCapacityPerDrink(int capacityPerDrink) {
		this.capacityPerDrink = capacityPerDrink;
	}

	public int getPercentagePerDrink() {
		return percentagePerDrink;
	}

	public void setPercentagePerDrink(int percentagePerDrink) {
		this.percentagePerDrink = percentagePerDrink;
	}

	public int getOrderCountPerDrink() {
		return orderCountPerDrink;
	}

	public void setOrderCountPerDrink(int orderCountPerDrink) {
		this.orderCountPerDrink = orderCountPerDrink;
	}

	public Menu[] getMenus() {
		return menus;
	}

	public void setMenus(Menu[] menus) {
		this.menus = menus;
	}

}
