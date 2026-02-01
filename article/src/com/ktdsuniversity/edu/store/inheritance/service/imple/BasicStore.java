package com.ktdsuniversity.edu.store.inheritance.service.imple;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;
import com.ktdsuniversity.edu.store.inheritance.VO.ProductVO;
import com.ktdsuniversity.edu.store.inheritance.VO.StoreVO;
import com.ktdsuniversity.edu.store.inheritance.dto.PaymentInfoDTO;
import com.ktdsuniversity.edu.store.inheritance.exceptions.DeficientAmountException;
import com.ktdsuniversity.edu.store.inheritance.exceptions.WrongOrderQuantityException;

public class BasicStore {
	StoreVO storeVO;
	ProductVO[] products;

	public BasicStore(StoreVO storeVO, ProductVO[] products) {
		this.storeVO = storeVO;
		this.products = products;
	}

	public StoreVO getStoreVO() {
		return storeVO;
	}

	public void sell(PaymentInfoDTO paymentInfoDTO) {
		int sellAmount = checkSellAmount(paymentInfoDTO.getCustomerVO(), paymentInfoDTO.getPaymentAmount(),
				paymentInfoDTO.getProductNum(), paymentInfoDTO.getQuantity());
		isAmountEnought(paymentInfoDTO.getPaymentAmount(), sellAmount, sellAmount);
		calcSellMoney(paymentInfoDTO.getCustomerVO(), paymentInfoDTO.getPaymentAmount(), sellAmount);
		printProduct(paymentInfoDTO.getCustomerVO());
	}

	public int checkSellAmount(CustomerVO customerVO, int paymentAmount, int productNum, int quantity) {
		if (productNum < 0 && productNum >= this.products.length) {
			throw new WrongOrderQuantityException("없는 메뉴입니다");
		}

		if (customerVO.getCurrentAmount() < paymentAmount) {
			throw new DeficientAmountException("소지 금액이 부족합니다");
		}
		int sellAmount = this.products[productNum].getPrice() * quantity;
		System.out.println("물건 가격:\t\t" + sellAmount + " 원");
		System.out.println("받은 돈:\t\t" + paymentAmount + " 원");

		return sellAmount;
	}

	public void isAmountEnought(int paymentAmount, int sellAmount, int finalAmount) {
		if (sellAmount > finalAmount)
			System.out.println("최종 결제 금액:\t" + finalAmount + " 원");
		if (paymentAmount < finalAmount)
			throw new DeficientAmountException("지불 금액이 " + (finalAmount - paymentAmount) + "원 부족합니다");

	}

	public void calcSellMoney(CustomerVO customerVO, int paymentAmount, int sellAmount) {
		customerVO.setCurrentAmount(customerVO.getCurrentAmount() - paymentAmount);
		this.storeVO.setStartAmount(this.storeVO.getStartAmount() + sellAmount);
		this.storeVO.setSellAmount(this.storeVO.getSellAmount() + sellAmount);
		customerVO.setCurrentAmount(customerVO.getCurrentAmount() + paymentAmount - sellAmount);

		System.out.println("거스름 돈:\t\t" + (paymentAmount - sellAmount) + " 원");
	}

	public void printProduct(CustomerVO customerVO) {
		System.out.println();
		System.out.println(" - " + this.storeVO.getName() + " 현황");
		System.out.println("가게 잔고:\t\t" + this.storeVO.getStartAmount() + " 원");
		System.out.println("금일 매출액:\t" + this.storeVO.getSellAmount() + " 원");
		System.out.println(" - " + customerVO.getName() + "님 현황");
		System.out.println("잔고:\t\t" + customerVO.getCurrentAmount() + " 원");
		System.out.println("보유 포인트:\t" + customerVO.getCurrentPoint() + " p");
	}
}
