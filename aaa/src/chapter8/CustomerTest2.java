package chapter8;

public class CustomerTest2 {
	
	public static void main(String[] args) {
		
		
		VIPCustomer vc = new VIPCustomer();
		vc.setCustomerID(10020);
		vc.setCustomerName("김");
		vc.bonusPoint = 10000;
				
			vc.showCustomerInfo();
		
	}

}
