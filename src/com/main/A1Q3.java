package com.main;

import com.beans.CustInfo;
import com.service.DepositService;
import com.service.WithdrawalService;

public class A1Q3 {

	public static void main(String[] args) {

		CustInfo c1 = new CustInfo();
		c1.setId(1);
		c1.setName("Peter Griffin");
		c1.setBalance(10000);
		
		CustInfo c2 = new CustInfo();
		c2.setId(2);
		c2.setName("Joe Swansan");
		c2.setBalance(25000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("");
		
		DepositService ds = new DepositService();
		WithdrawalService ws = new WithdrawalService();
		
		
		ds.deposit(c1, 7000);
		System.out.println(c1);
		
		
		ds.deposit(c2, 35000);
		System.out.println(c2);
		
		
		ws.withdraw(c1, 18000);
		
		ws.withdraw(c1, 7000);
		System.out.println(c1);
	
		
		ws.withdraw(c2, 51000);
		
		ws.withdraw(c2, 19000);
		System.out.println(c2);
		
	}

}
