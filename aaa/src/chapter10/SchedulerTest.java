package chapter10;

import java.io.IOException;

public class SchedulerTest {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 할당 방식 선택");
		
		
		int ch = System.in.read();
		Scheduler sd = null;
		
		if(ch == 'R' || ch == 'r') {
			sd = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			sd = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			sd = new PriorityAllocation();
		}
		else {
			System.out.println("지원되지 않음");
			return;
		}
		
		sd.getNextCall();
		sd.sendCallToAgent();
	}

}
