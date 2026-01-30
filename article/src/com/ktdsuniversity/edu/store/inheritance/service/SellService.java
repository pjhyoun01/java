package com.ktdsuniversity.edu.store.inheritance.service;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;

public interface SellService {
	int sellProduct(CustomerVO customerVO, int productNum);
	int refundMoney(CustomerVO customerVO, int productPrice);
}
