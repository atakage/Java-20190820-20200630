package chapter8;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		c.setCustomerID(10010);
		c.setCustomerName("이");
		c.bonusPoint = 1000;
		c.showCustomerInfo();
		
		VIPCustomer vc = new VIPCustomer();
		
		vc.setCustomerID(10020);
		vc.setCustomerName("김");
		vc.bonusPoint = 1000;
		vc.showCustomerInfo();
		
	}

}
