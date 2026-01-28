package com.ktdsuniversity.edu.mart;

public class DepartmentStore extends ConvenStore {

	//	고객의 등급 0 일반, 1 vip, 2 vvip
	private int custLevel;
	
	public DepartmentStore(Product[] products) {
		super(products);
	}
	
	/**
	 * 고객 등급별 차등 포인트 적립
	 * 일반: 할인 x, 포인트 o
	 * vip: 할인 3%, 포인트 x
	 * vvip: 할인 3%, 포인트 o
	 * @return
	 */
	public int discountOrSavePoint() {
		return 0;
	}
	/*
	 * 10000포인트 이상 시 사용 가능(전액 || 부분 사용)
	 */
}
