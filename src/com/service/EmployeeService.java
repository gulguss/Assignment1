package com.service;

import java.util.ArrayList;

import com.beans.EmployInfo;

public class EmployInfoService {
	public ArrayList<EmployInfo> getAllEmployInfo(){
		
		EmployInfo e1 = new EmployInfo();
		e1.setEmployId(1);
		e1.setEmployName("harry potter");
		e1.setEmployCity("london");
		e1.setEmploySalary(85000);
		
		EmployInfo e2 = new EmployInfo();
		e2.setEmployId(2);
		e2.setEmployName("hermoine granger");
		e2.setEmployCity("london");
		e2.setEmploySalary(95000);
		
		EmployInfo e3 = new EmployInfo();
		e3.setEmployId(3);
		e3.setEmployName("ronald weasley");
		e3.setEmployCity("surrey");
		e3.setEmploySalary(75000);
		
		ArrayList<EmployInfo> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		return list;
	}
}
