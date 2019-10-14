package chapter13;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TravelCustomer tc = new TravelCustomer("이", 40, 100);
		TravelCustomer tc2 = new TravelCustomer("김", 20, 100);
		TravelCustomer tc3 = new TravelCustomer("홍", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(tc);
		customerList.add(tc2);
		customerList.add(tc3);
		
		
		System.out.println("== 명단 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 비용" + total);
		
		System.out.println("== 20세 이상 ==");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s->System.out.println(s));

	}

}
