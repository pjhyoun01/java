package com.ktdsuniversity.edu.generics.hw.hw1;

public class SitVO {
	private int sitNum;
	private boolean isReserve;

	public SitVO(int sitNum, boolean isReserve) {
		this.sitNum = sitNum;
		this.isReserve = isReserve;
	}

	public int getSitNum() {
		return sitNum;
	}

	public boolean isReserve() {
		return isReserve;
	}

	public void setReserve(boolean isReserve) {
		this.isReserve = isReserve;
	}

}
