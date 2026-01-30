package com.ktdsuniversity.edu.store.inheritance.service;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;

public interface PointService {
	int usePoint(CustomerVO customerVO, int productPrice);
	int savePoint(CustomerVO customerVO, int productPrice);
}
