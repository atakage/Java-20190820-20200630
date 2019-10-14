package com.biz.service;

import java.util.List;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudentVO;

public class ScoreServiceV2 extends ScoreServiceV1{
	
	

	List<StudentVO> stdList = null;
	
	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("===============================");
		System.out.println("성적일람표");
		System.out.println("==============================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==========================================");
		
		for(ScoreVO scVO : scList) {				//scList는 선언, 초기화 부분이 보이지 않지만 ScoreServiceV1에서 protected상태로 상속받았기 때문에 접근하여 값을 읽을 수 있음
		
			String strNum = scVO.getStrNum();
			StudentVO stVO = this.searchStd(strNum);
			
			String strName;
			String strAddr;
			String strTel;
			if(stVO == null) {
				strName = "없음";
				strAddr = "없음";
				strTel = "없음";
			}else {
				strName = stVO.getStrName();
				strAddr = stVO.getStrAddr();
				strTel = stVO.getStrTel();
			}
			
			
			System.out.print(scVO.getStrNum()+"\t");
			System.out.print(strName + "\t");
			System.out.printf("%3d\t", scVO.getIntKor());
			System.out.printf("%3d\t", scVO.getIntEng());
			System.out.printf("%3d\t", scVO.getIntMath());
			System.out.printf("%3d\t", scVO.getIntTotal());
			System.out.printf("%3d\n", scVO.getIntAvg());
			
		}
		System.out.println("=================================");
	}
	
	
	public void setStdList(List<StudentVO> stdList) {
			this.stdList = stdList;
	}
	
	
	private StudentVO searchStd(String strNum) {
		
		for(StudentVO stVO : stdList) {
			if(stVO.getStrNum().equals(strNum))
				return stVO;
		}
		
		return null;
		
	}
	

}
