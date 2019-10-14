package chapter8;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	
	public Customer(int customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
		
	}
	
	public int calcPrice(int price) {
		
	bonusPoint = (int) (bonusPoint + price * bonusRatio) ;
	return price;
	}
	
	public void showCustomerInfo() {
		System.out.println("이름:" + customerName);
		System.out.println("등급: "+ customerGrade);
		System.out.println("포인트: "+ bonusPoint);
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
