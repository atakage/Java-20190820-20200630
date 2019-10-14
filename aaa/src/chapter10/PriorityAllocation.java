package chapter10;

public class PriorityAllocation implements Scheduler{
	
	public void getNextCall() {
		
		System.out.println("등급이 높은 고객의 전화를 먼저 가져옴");
		
		
	}

	
	public void sendCallToAgent() {
		System.out.println("업무 스킬 높은 상담원에게 우선적으로 배분");
	}
}
