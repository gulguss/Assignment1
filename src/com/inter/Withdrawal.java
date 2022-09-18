package com.inter;

import com.beans.CustInfo;

public interface Withdrawal {
	double limit = 50000;
	void withdraw(CustInfo customer,double amount);
}
