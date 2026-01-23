package com.ktdsuniversity.edu.restaurant;

public class Restaurant {
//	식당 배부름 기준
	private int hungerLevelPerRest;
//	식당별 취함 기준
	private int drunkLevelPerRest;
	
	Restaurant[] restaurants;

	public Restaurant(int hungerLevelPerRest, int drunkLevelPerRest) {
		this.hungerLevelPerRest = hungerLevelPerRest;
		this.drunkLevelPerRest = drunkLevelPerRest;
	}

	public int getHungerLevelPerRest() {
		return hungerLevelPerRest;
	}

	public void setHungerLevelPerRest(int hungerLevelPerRest) {
		this.hungerLevelPerRest = hungerLevelPerRest;
	}

	public int getDrunkLevelPerRest() {
		return drunkLevelPerRest;
	}

	public void setDrunkLevelPerRest(int drunkLevelPerRest) {
		this.drunkLevelPerRest = drunkLevelPerRest;
	}

	// 주문 받을지 판단하기
	public void judgeOrder() {

	}

//	손님이 배부른지 판단하기
	public void judgeHungerLevel() {

	}

//	손님이 취한지 판단하기
	public void judgeDrunklevel() {

	}
}
