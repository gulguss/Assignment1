package com.service;

import com.beans.CustInfo;
import com.inter.Deposit;

public class DepositService implements Deposit {

	@Override
	public void deposit(CustInfo CustInfo, double amount) {
		CustInfo.setBalance(CustInfo.getBalance()+amount);
		System.out.println("Rs."+amount+" Deposit Successful");
	}

}
