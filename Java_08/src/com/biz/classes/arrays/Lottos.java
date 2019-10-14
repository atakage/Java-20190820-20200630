package com.biz.classes.arrays;

import java.util.Random;

public class Lottos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		int[] lottos = new int[6];
		
		
		// 번호 6개를 모두 생성했는지 확인하기 위한 변수
		int nLottoIndex = 0;
		
		while(true) {
			
			
			int lotNum = rnd.nextInt(45) + 1;
			int index;
			
			//새로 생성한 번호가 이미 생성된 번호 중에 있나
			for(index = 0; index < lottos.length; index++) {
				
				// lottos 배열에 저장된 값이 새로 생성한 값과 같은 것이 있냐
				if(lottos[index] == lotNum)break;
				
			}
			
			//같은 값이 없다
			if(index >= lottos.length)
				
				
				lottos[nLottoIndex++] = lotNum;
			
			if(nLottoIndex >= lottos.length)break;
		}
		
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + ",");
		}

	}

}
