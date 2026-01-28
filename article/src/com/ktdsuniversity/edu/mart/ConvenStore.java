package com.ktdsuniversity.edu.mart;

public class ConvenStore extends NormalStore {
	Customer cust;
	private float point;

	public ConvenStore(Product[] products, String name, Customer cust, float point) {
		super(products, name);
		this.cust = cust;
		this.point = point;
	}
	
	

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public void printPoint() {
		
		System.out.println(cust.getName() + "님의 포인트: " + this.point);
	}
	
	/**
	 * 구매 금액의 0.1% 만큼 적립
	 * 
	 * @return 적립 포인트
	 */
	public float savePoint(int productPrice) {
		float expectPoint = productPrice / 1000;
		this.point += expectPoint;
		System.out.println("적립금: " + expectPoint);
		return expectPoint;
	}

	/**
	 * 
	 * 100 포인트 이상 시 사용(전액 사용)
	 * 
	 * @return 사용 가능한 포인트
	 */
	public int usePoint(int productNum) {
		int pointAmount = 0;
		if (this.point >= 100) {
			pointAmount = this.products[productNum].getPrice() - (int) this.point;
			this.point -= pointAmount;
		}
		return pointAmount;
	}
}
