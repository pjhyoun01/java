package com.ktdsuniversity.edu.restaurant;

public class Customer {
	private int weight;
	private boolean gender;
	private int hungerLevelPerCust;
	private int drunkLevelPerCust;
	
	Customer[] customers;

	public Customer(int hungerLevelPerCust, int drunkLevelPerCust) {
		this.hungerLevelPerCust = hungerLevelPerCust;
		this.drunkLevelPerCust = drunkLevelPerCust;
	}

	public int getHungerLevelPerCust() {
		return hungerLevelPerCust;
	}

	public void setHungerLevelPerCust(int hungerLevelPerCust) {
		this.hungerLevelPerCust = hungerLevelPerCust;
	}

	public int getDrunkLevelPerCust() {
		return drunkLevelPerCust;
	}

	public void setDrunkLevelPerCust(int drunkLevelPerCust) {
		this.drunkLevelPerCust = drunkLevelPerCust;
	}

	// 주문하기
	public void order() {

	}

//	배부름 증가하기
//	손님이 음식을 주문하면 음식마다의 무게만큼 배부름 정도가 채워집니다.
	public void increaseHungerLevel() {
		
	}

//	취함 증가하기
//	손님이 술을 주문하면 술 마다의 알콜 비율의 10% 만큼 취함 정도가 증가합니다.
	public void increaseDrunklevel() {

	}


//	배부름 정도 계산
	public double calcHungerLevel () {
//		((음식별 무게 * 각 주문 개수) / 손님 별 용량) * 100
		double capacityPerCust;
		
//		50 kg	약 1.0 kg ~ 1.25 kg	약 330 g ~ 410 g
//		60 kg	약 1.2 kg ~ 1.50 kg	약 400 g ~ 500 g
//		70 kg	약 1.4 kg ~ 1.75 kg	약 460 g ~ 580 g
//		80 kg	약 1.6 kg ~ 2.00 kg	약 530 g ~ 660 g
//		90 kg	약 1.8 kg ~ 2.25 kg	약 600 g ~ 750 g
		return 0.0;
	}
	
//	혈중알코올 농도 계산
	public double calcBAC(Menu info) {
		double genderNum = 0;
		if (gender) {
//			성별이 true일 때만 1: 남자
//			false일 때는 0: 여자
			genderNum = 0.86;
		} else {
			genderNum = 0.64;
		}
//		A = 마신 용량(ml) * 도수(%) * 0.8(알코올 비중)
		double totalAlcohol = info.getCapacityPerDrink() * info.getPercentagePerDrink() * 0.8;
//		C혈중알코올농도 = (A마신 알코올의 총량 * 0.7) / (P체중 * R성별 계수(남성:0.86, 여성 0.64) * 10)
		double bloodAlcoholConcentration = (totalAlcohol * 0.7) / (weight * genderNum * 10.0);
		return bloodAlcoholConcentration;
	}
}
