package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.StudentVO;

public class StudentEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		List<StudentVO> stdList2 = new ArrayList<StudentVO>();

		
		long s = System.currentTimeMillis();
		
		for (long i = 0; i < 1000000; i++) {

			StudentVO stdVO = new StudentVO();

			stdVO.setSt_num(String.format("%05d", i));
			stdList.add(stdVO);

		}
		long e = System.currentTimeMillis();
		System.out.println(s-e);

		
		
		s = System.currentTimeMillis();
		for (long i = 0; i < 1000000; i++) {

			stdList2.add(new StudentVO(String.format("%05d", i), "", "", "", 0, "")); // 필드 생성자에 값을 주입하면서 직접 add()
																						// method에 객체를 주입

		}
		e = System.currentTimeMillis();
		System.out.println(s-e);

	}

}
