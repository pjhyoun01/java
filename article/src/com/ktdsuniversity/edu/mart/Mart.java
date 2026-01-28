package com.ktdsuniversity.edu.mart;

public class Mart {
	public static void main(String[] args) {
		Product[] productArray = {
				new Product("과자", 1_900),
				new Product("소고기", 70_000),
				new Product("돼지고기", 20_000),
				new Product("당근", 3_400),
				new Product("오이", 2_000),
				new Product("냉동만두", 8_300),
		};
		
		Customer cust = new Customer("박재현", 60_000);
		
		NormalStore normal = new NormalStore(productArray, "칠성수퍼");
		NormalStore conven = new ConvenStore(productArray, "GS 25", cust, 1000);
		
		int x = normal.sellProduct(2, cust);
		System.out.println(x);
		if (conven instanceof ConvenStore store) {
			store.savePoint(x);
			
		}
		
		
		
	}
}
