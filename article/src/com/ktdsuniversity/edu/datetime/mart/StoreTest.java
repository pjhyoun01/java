package com.ktdsuniversity.edu.datetime.mart;

public class StoreTest {
	public static void main(String[] args) {
		
		Store store = new Store();
		store.add(new Item("우유", "2026-02-04"));
		store.add(new Item("매일우유", "2026-02-06"));
		store.add(new Item("남양우유", "2026-02-07"));
		store.add(new Item("딸기우유", "2026-02-05"));
		store.add(new Item("초코우유", "2026-02-08"));
		store.add(new Item("메론우유", "2026-02-04"));
		store.add(new Item("상한우유", "2026-02-01"));
		store.add(new Item("싱싱한우유", "2026-02-02"));
		store.add(new Item("맛없는우유", "2026-02-03"));
		store.add(new Item("맛있는우유", "2026-02-07"));
		
		store.sell(0);
		store.sell(1);
		store.sell(2);
		store.sell(3);
		store.sell(4);
		store.sell(5);
		store.sell(6);
		store.sell(7);
		store.sell(8);
		store.sell(9);
		store.sell(10);
		store.sell(11);
		
		/*
		상품명: 우유, 소비기한: 2026-02-04
		오늘까지 드세요
		
		상품명: 매일우유, 소비기한: 2026-02-06
		가능한 빨리 드세요
		
		상품명: 남양우유, 소비기한: 2026-02-07
		7일 까지 드세요
		
		상품명: 딸기우유, 소비기한: 2026-02-05
		가능한 빨리 드세요
		
		상품명: 초코우유, 소비기한: 2026-02-08
		8일 까지 드세요
		
		상품명: 메론우유, 소비기한: 2026-02-04
		오늘까지 드세요
		
		상품명: 상한우유, 소비기한: 2026-02-01
		소비기한이 지나 판매하지 않습니다
		
		상품명: 싱싱한우유, 소비기한: 2026-02-02
		소비기한이 지나 판매하지 않습니다
		
		상품명: 맛없는우유, 소비기한: 2026-02-03
		소비기한이 지나 판매하지 않습니다
		
		상품명: 맛있는우유, 소비기한: 2026-02-07
		7일 까지 드세요
		 */
	}
	
}
