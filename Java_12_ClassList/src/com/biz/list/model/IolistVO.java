package com.biz.list.model;




public class IolistVO {
	
	private String strDate;
	private String strTime;
	private String strName;
	private int intPrice;
	private int intQuantity;
	private int intTotal;
	
	
	public IolistVO(String strDate, String strTime, String strName, int intPrice) {
		
		this.strDate = strDate;
		this.strTime = strTime;
		this.strName = strName;
		this.intPrice = intPrice;
		
		
	}
	
	
	public IolistVO(String strDate, String strTime, String strName, int intPrice, int intQuantity) {
		
		this.strDate = strDate;
		this.strTime = strTime;
		this.strName = strName;
		this.intPrice = intPrice;
		this.intQuantity = intQuantity;
		
	}
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrTime() {
		return strTime;
	}
	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntQuantity() {
		return intQuantity;
	}
	public void setIntQuantity(int intQuantity) {
		this.intQuantity = intQuantity;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intPrice, int intQuantity) {
		this.intTotal = intPrice * intQuantity;
	}
	
	

}
