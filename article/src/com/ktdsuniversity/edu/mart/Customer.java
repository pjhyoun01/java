package com.ktdsuniversity.edu.mart;

public class Customer {
	private String name;
	private int payMoney;

	public Customer(String name, int payMoney) {
		this.name = name;
		this.payMoney = payMoney;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}

}
