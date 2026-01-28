package com.ktdsuniversity.edu.mart;

public class Customer {
	private String name;
	private int payMoney;
//	고객의 등급 0 일반, 1 vip, 2 vvip
	private int custLevel;
	private float earnedPoint;

	public Customer(String name, int payMoney, int custLevel, float earnedPoint) {
		this.name = name;
		this.payMoney = payMoney;
		this.custLevel = custLevel;
		this.earnedPoint = earnedPoint;
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

	public int getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(int custLevel) {
		this.custLevel = custLevel;
	}

	public float getEarnedPoint() {
		return earnedPoint;
	}

	public void setEarnedPoint(float earnedPoint) {
		this.earnedPoint = earnedPoint;
	}

}
