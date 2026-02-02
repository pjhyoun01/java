package com.ktdsuniversity.edu.generics.hw.hw1;

public class SitVO {
	private int sitNum;
	private boolean isReserve;

	public SitVO(int sitNum, boolean isReserve) {
		this.sitNum = sitNum;
		this.isReserve = isReserve;
	}

	@Override
	public String toString() {
		String OX = "X";
		if (isReserve) {
			OX = "O";
		}
		return sitNum + ". " + OX;
	}

	public boolean isReserve() {
		return isReserve;
	}
	
	
	

}
