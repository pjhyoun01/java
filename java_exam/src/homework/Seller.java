package homework;

public class Seller {
	final int price = 1_000;
	int quantity;
	int capital;
	
//	sell
	public int[] sell(int num) {
		int[] array = new int[2];
		array[0] = this.quantity - num;
		array[1] = this.capital - (this.quantity * price);
		return array;
	}

	/*
	 * 판매자가 판매하는 모든 상품의 금액은 1_000
	 * 판매자는 한번에 n개 만큼의 상품을 판매할 수 있음
	 * 판매(5); 라고 한다면 판매자의 상품 재고에서 5개를 빼야 함
	 * 또한 5개를 판매한 금액을 판매자의 자본금에 더해야 함
	 * 
	 * 판매자가 소지한 상품의 개수보다 더 많은 개수의 상품을 판매하려 할 경우
	 * 		남은 모든 재고를 판매해야하며
	 * 남은 재고를 판매한 금액만큼 판매자의 자본금에 더해야 함
	 * 
	 * 판매자의 재고가 없으면 "품절 되었습니다" 출력
	 * 
	 * 상품의 판매 프로세스가 종료되었다면 판매자의 재고 수, 판매자의 자본금 출력
	 */
}
