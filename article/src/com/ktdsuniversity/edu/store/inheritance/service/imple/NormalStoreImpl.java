package com.ktdsuniversity.edu.store.inheritance.service.imple;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;
import com.ktdsuniversity.edu.store.inheritance.service.SellService;

public class NormalStoreImpl implements SellService{

	@Override
	public int sellProduct(CustomerVO customerVO, int productNum) {
		
		return 0;
	}

	@Override
	public int refundMoney(CustomerVO customerVO, int productPrice) {
		return 0;
	}

}
