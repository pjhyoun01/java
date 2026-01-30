package com.ktdsuniversity.edu.store.inheritance.VO;

public class StoreVO {
	private String name;
	private int startingAmount;
	private int sellAmount;

	public StoreVO(String name, int startingAmount, int sellAmount) {
		this.name = name;
		this.startingAmount = startingAmount;
		this.sellAmount = sellAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartingAmount() {
		return startingAmount;
	}

	public void setStartingAmount(int startingAmount) {
		this.startingAmount = startingAmount;
	}

	public int getSellAmount() {
		return sellAmount;
	}

	public void setSellAmount(int sellAmount) {
		this.sellAmount = sellAmount;
	}

}
