package com.ktdsuniversity.edu.generics.hw.hw1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReserveMain {
	
	public static void printCurrentReservation() {
		
	}

	public static void main(String[] args) {		
		Map<Integer, List<SitVO>> flight = new HashMap<>();
		flight.put(1, new ArrayList<>());
		flight.put(2, new ArrayList<>());
		flight.put(3, new ArrayList<>());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.\r\n"
				+ "비행기 편의 이름을 입력하세요: ");
		int flightNum = sc.nextInt();
		
		List<SitVO> sits1 = flight.get(1);
		sits1.add(new SitVO(1, false));
		sits1.add(new SitVO(2, true));
		sits1.add(new SitVO(3, false));
		List<SitVO> sits2 = flight.get(2);
		sits2.add(new SitVO(1, false));
		sits2.add(new SitVO(2, false));
		sits2.add(new SitVO(3, false));
		List<SitVO> sits3 = flight.get(3);
		sits3.add(new SitVO(1, false));
		sits3.add(new SitVO(2, true));
		sits3.add(new SitVO(3, false));

		int soldOut = 0;
		System.out.println("\"" + String.format("%04d", flightNum) + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
		if(flight.get(flightNum) != null) {
			for (SitVO sit : flight.get(flightNum)) {
				if (sit.isReserve()) {
					soldOut++;
				}
				if (soldOut > 0) {
					System.out.println(sit);
				} else {
					System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
				}
			}
		} else {
			System.out.println("\"" + String.format("%04d", flightNum) + "\" 편은 존재하지 않습니다");
		}
		
		System.out.print("다른 비행기 편의 이름을 입력하세요: ");
		flightNum = sc.nextInt();

		
	}
}
