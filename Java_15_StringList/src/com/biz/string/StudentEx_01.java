package com.biz.string;

import com.biz.service.StringService;
import com.biz.service.StudentServiceV1;
import com.biz.string.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringService strService = new StudentServiceV1();
		
		strService.input();
		strService.list();
		
		
		StudentVO stdVO = ((StudentServiceV1)strService).search("00005");
		
		
		
		if(stdVO == null) {
			System.out.println("찾는 데이터 없음");
		}else {
			System.out.println(stdVO.toString());
		}

	}

}
