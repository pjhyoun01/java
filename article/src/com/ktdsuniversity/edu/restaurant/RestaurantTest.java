package com.ktdsuniversity.edu.restaurant;
public class RestaurantTest {
    public static void main(String[] args) {
        Menu[] menuArray = {
            new Menu("스테이크", 90, 30_000),
            new Menu("파스타", 110, 15_000),
            new Menu("진로", 180, 16, 4_000),
            new Menu("처음처럼", 180, 17, 4_000),
            new Menu("발렌타인", 300, 37, 20_000),
            new Menu("위스키", 300, 42, 20_000),
            new Menu("사케", 300, 13, 13_000),
            new Menu("밤막걸리", 500, 7, 8_000),
            new Menu("땅콩막걸리", 500, 8, 8_000),
        };
        Restaurant rest = new Restaurant(500, 0.1, menuArray);
        Customer cust = new Customer(75, 200_000, true);
        Customer cust2 = new Customer(75, 200_000, true);
        
        rest.printMenuAndDrink();

        cust.order(cust, rest, menuArray[0], 2);
        cust.order(cust, rest, menuArray[0], 2);
        cust.order(cust, rest, menuArray[0], 2);
        cust.order(cust, rest, menuArray[1], 2);
        cust.order(cust, rest, menuArray[2], 4);
        cust.order(cust, rest, menuArray[4], 1);
        cust.order(cust, rest, menuArray[8], 3);
        
        cust.printStatus();
    }
}