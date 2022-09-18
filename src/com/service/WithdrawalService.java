package com.service;

import com.beans.CustInfo;
import com.inter.Withdrawal;

public class WithdrawalService implements Withdrawal {

	@Override
	public void withdraw(CustInfo CustInfo, double amount) {
		if(amount<limit)
			if(CustInfo.getBalance()>amount) {
				CustInfo.setBalance(CustInfo.getBalance()-amount);
				System.out.println("Rs."+amount+" Withdrawal Successful");
			}
			else
				System.out.println("Not Sufficient balance");
		else
			System.out.println("Amount should not be > Rs.50000");
	}

}
