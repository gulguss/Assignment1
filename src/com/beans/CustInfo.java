package com.beans;

public class CustInfo {
	private int CustId;
	private String CustName;
	private double Custbal;
	
	public CustInfo() {
		super();
	}
	public CustInfo(int CustId, String CustName, double Custbal) {
		super();
		this.CustId = CustId;
		this.CustName = CustName;
		this.Custbal = Custbal;
	}
	public int getCustId() {
		return CustId;
	}
	public voCustId setCustId(int CustId) {
		this.CustId = CustId;
	}
	public String getCustName() {
		return CustName;
	}
	public voCustId setCustName(String CustName) {
		this.CustName = CustName;
	}
	public double getCustbal() {
		return Custbal;
	}
	public voCustId setCustbal(double Custbal) {
		this.Custbal = Custbal;
	}
	@OverrCustIde
	public String toString() {
		return "CustInfo \n{\t CustId=" + CustId + ",\n\t CustName=" + CustName + ",\n\t Custbal=" + Custbal + "\n}";
	}
	
	
}
