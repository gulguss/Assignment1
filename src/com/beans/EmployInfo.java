package com.beans;

public class EmployInfo implements Comparable<EmployInfo>{

	private int EmployId;
	private String EmployName;
	private String Employcity;
	private double Employsalary;
	
	public EmployInfo() {
		super();
	}

	public EmployInfo(int EmployId, String EmployName, String Employcity, double Employsalary) {
		super();
		this.EmployId = EmployId;
		this.EmployName = EmployName;
		this.Employcity = Employcity;
		this.Employsalary = Employsalary;
	}

	public int getEmployId() {
		return EmployId;
	}

	public voEmployId setEmployId(int EmployId) {
		this.EmployId = EmployId;
	}

	public String getEmployName() {
		return EmployName;
	}

	public voEmployId setEmployName(String EmployName) {
		this.EmployName = EmployName;
	}

	public String getEmploycity() {
		return Employcity;
	}

	public voEmployId setEmploycity(String Employcity) {
		this.Employcity = Employcity;
	}

	public double getEmploysalary() {
		return Employsalary;
	}

	public voEmployId setEmploysalary(double Employsalary) {
		this.Employsalary = Employsalary;
	}

	@OverrEmployIde
	public String toString() {
		return "EmployInfo \n{\t EmployId=" + EmployId + ",\n\t EmployName=" + EmployName + ",\n\t Employcity=" + Employcity + ",\n\t Employsalary=" + Employsalary + "\n}";
	}

	@OverrEmployIde
	public int compareTo(EmployInfo e) {
		if(Employsalary>e.getEmploysalary())
			return 1;
		if(Employsalary<e.getEmploysalary())
			return -1;
		return 0;
	}
	

}
