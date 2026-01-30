package com.ktdsuniversity.edu.store.inheritance.service.imple;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;
import com.ktdsuniversity.edu.store.inheritance.service.PointService;
import com.ktdsuniversity.edu.store.inheritance.service.SellService;

public class ConvenienceStoreImpl implements SellService, PointService {

	@Override
	public int usePoint(CustomerVO customerVO, int productPrice) {
		return 0;
	}

	@Override
	public int savePoint(CustomerVO customerVO, int productPrice) {
		return 0;
	}

	@Override
	public int sellProduct(CustomerVO customerVO, int productNum) {
		return 0;
	}

	@Override
	public int refundMoney(CustomerVO customerVO, int productPrice) {
		return 0;
	}

}
