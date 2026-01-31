package com.ktdsuniversity.edu.restaurant;

public class Menu {
	private String name;
	private int weightPerMenu;
	private boolean isFood; // true: 음식, false: 술
	private int percentagePerDrink;
	private int price;

	public Menu(String name, int weightPerMenu, int price) {
		this.name = name;
		this.weightPerMenu = weightPerMenu;
		this.price = price;
		this.isFood = true;
	}

	public Menu(String name, int weightPerMenu, int percentagePerDrink, int price) {
		this.name = name;
		this.weightPerMenu = weightPerMenu;
		this.percentagePerDrink = percentagePerDrink;
		this.price = price;
		this.isFood = false;
	}

	public String getName() {
		return name;
	}

	public int getWeightPerMenu() {
		return weightPerMenu;
	}

	public boolean isFood() {
		return isFood;
	}

	public int getPercentagePerDrink() {
		return percentagePerDrink;
	}

	public int getPrice() {
		return price;
	}

}