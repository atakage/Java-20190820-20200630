package com.biz.iolist.domain;

public class IolistVO {
	
	private String strDate;
	private String strPName;
	private String strIO;
	private int intPrice;
	private int intQtt;
	
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrPName() {
		return strPName;
	}
	public void setStrPName(String strPName) {
		this.strPName = strPName;
	}
	public String getStrIO() {
		return strIO;
	}
	public void setStrIO(String strIO) {
		this.strIO = strIO;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntQtt() {
		return intQtt;
	}
	public void setIntQtt(int intQtt) {
		this.intQtt = intQtt;
	}
	@Override
	public String toString() {
		return "IolistVO [strDate=" + strDate + ", strPName=" + strPName + ", strIO=" + strIO + ", intPrice=" + intPrice
				+ ", intQtt=" + intQtt + "]";
	}
	
	

}
