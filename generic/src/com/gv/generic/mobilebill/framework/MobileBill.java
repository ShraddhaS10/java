package com.gv.generic.mobilebill.framework;

public interface MobileBill<T extends Payable> {

	Float generateBill (T payable);
	
}
