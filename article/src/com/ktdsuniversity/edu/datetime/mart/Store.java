package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
	private List<Item> items;

	public Store() {
		this.items = new ArrayList<>();
	}

	public void add(Item item) {
		this.items.add(item);
	}

	public void sell(int index) {
		/*
		 * index에 할당 되어있는 제품의 소비기한이 당일이라면 오늘까지 드세요 출력
		 * 
		 * 3일 내에 도래하면 가능한 빨리 드세요
		 * 
		 * 지났으면 소비기한이 지나 판매하지 않습니다
		 */
//		if (items.get(index) == null ) {
//			throw new NullPointerException();
//		}
//		if (index > this.items.size()) {
//			throw new IndexOutOfBoundsException();
//		}

			LocalDate canEatDate = LocalDate.parse(items.get(index).getExpireDate().toString());
			LocalDate now = LocalDate.now();
			System.out.println(items.get(index));
			if (canEatDate.isBefore(now.plusDays(3)) && canEatDate.isAfter(now)) {
				System.out.println("가능한 빨리 드세요");
			} else if (canEatDate.toString().equals(now.toString())) {
				System.out.println("오늘까지 드세요");
			} else if (canEatDate.isBefore(now)) {
				System.out.println("소비기한이 지나 판매하지 않습니다");
			} else {
				System.out.println(canEatDate.getDayOfMonth() + "일 까지 드세요");
			}
			System.out.println();
		}


}
