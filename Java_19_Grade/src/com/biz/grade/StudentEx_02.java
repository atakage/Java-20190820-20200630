package com.biz.grade;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.StudentServiceV1;

public class StudentEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentServiceV1 ss = new StudentServiceV1();
		
		String stdFileName = "src/com/biz/grade/학생명부.txt";
		try {
			ss.read(stdFileName);
			StudentVO stdVO = ss.getStudent("A001");
			
			if(stdVO != null) {
				System.out.println(stdVO.toString());
			}
			
			System.out.println(ss.getStudent("A002").toString());	//ss객체의 getStudent()메서드를 실행하고 그 결과(stdVO)에 toString()메서드를 실행(class의 chain 코딩)
			
			stdVO = ss.getStudent("A020");
			if(stdVO != null) {
				System.out.println(stdVO.toString());
			}else {
				System.out.println("A020 학생 없음");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
