package com.ktdsuniversity.edu.store.inheritance;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;
import com.ktdsuniversity.edu.store.inheritance.level.VIP;
import com.ktdsuniversity.edu.store.inheritance.level.VVIP;

public class MartMain {
	public static void main(String[] args) {
		CustomerVO cust1 = new CustomerVO(null, 0);
		CustomerVO cust2 = new VIP(null, 0);
		CustomerVO cust3 = new VVIP(null, 0);
		
		
		
	}
}
