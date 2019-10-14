package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		/*
		 * 자바 빈즈 패턴(Java Beans Pattern), 자바의 고전적 코딩
		 * 
		 */
		
		StudentVO stdVO = new StudentVO();
		
		stdVO.setSt_num("001");						
		stdVO.setSt_name("홍길동");
		stdVO.setSt_tel("010-111");
		stdVO.setSt_addr("서울특별시");
		stdVO.setSt_grade(3);
		
		stdList.add(stdVO);
		
		
		stdVO = new StudentVO("003", "성춘향", "010-222", "남원시", 3, "005");			
		
		stdList.add(stdVO);
		
		stdList.add(new StudentVO("004", "임꺽정", "010-222", "남원시", 3, "005"));		// 별도의 변수 객체를 만들지 않고 add() method에 생성자 코드 작성해 리스트 추가
																			// 생성자의 매개변수 순서 등을 명확히 인식해야 함, 지금 당장 추가하지 않아도 되는 값 의무적으로 다 넣어야 함
		
		
		
		
		
	}

}
