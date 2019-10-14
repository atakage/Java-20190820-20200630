package com.biz.iolist.exec;

public class RandomEx_01 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
		double rnd1 = Math.random();
		System.out.println(rnd1);
		
		}
		
		int start = 10;
		int end = 55;
		
		for(int i = 0; i < 10; i++) {
			double rnd1 = Math.random();
			int num = (int)(rnd1 * (end - start + 1) + start);	//start ~end까지 범위의 임의 수를 생성
			System.out.println(num);
			
			}
	}

}
