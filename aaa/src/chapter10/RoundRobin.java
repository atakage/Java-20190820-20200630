package chapter10;

public class RoundRobin implements Scheduler{

	public void getNextCall() {
		
		System.out.println("상담 전화를 순서대로 대기열에서 가져옴");
	}
	
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분");
	}
}
