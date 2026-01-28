package com.ktdsuniversity.edu.mart;

public class NormalStore {

	Product[] products;

	private String name;
	private int storeMoney;

	public NormalStore(Product[] products, String name) {
		this.name = name;
		this.products = products;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStoreMoney() {
		return storeMoney;
	}

	public void setStoreMoney(int storeMoney) {
		this.storeMoney = storeMoney;
	}

	/**
	 * 상품 번호와 지불 금액을 받고 거스름돈 반환
	 * 
	 * @param productNum 상품 번호
	 * @param money      지불 금액
	 * @return 판매 금액
	 */
	public int sellProduct(int productNum, Customer cust) {
//		상품 번호가 없을 때 아무것도 하지 않음
		if (productNum < 0 || productNum > this.products.length) {
			System.out.println("잘못된 주문");
			return 0;
		}
//		지불 금액이 상품 금액보다 작다면 아무것도 하지 않음
		if (cust.getPayMoney() < this.getProducts()[productNum].getPrice()) {
			System.out.println("금액 부족");
			return 0;
		}
//		store 보유금		
		this.setStoreMoney(this.getStoreMoney() + this.getProducts()[productNum].getPrice());
		System.out.println("가게 판매 금액: " + this.storeMoney);
		System.out.println("반환금: " + (cust.getPayMoney() - this.getProducts()[productNum].getPrice()));
		return this.getProducts()[productNum].getPrice();
	}

}
