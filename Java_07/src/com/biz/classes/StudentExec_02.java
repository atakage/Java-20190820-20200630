package com.biz.classes;

import com.biz.classes.student.StudentVO;

public class StudentExec_02 {
	
	public static void main(String[] args) {
		
		StudentVO stVO = new StudentVO();
		
		stVO.strNum = "001";
		stVO.strName = "홍길동";
		stVO.intYear = 2012;
		stVO.strDept = "법학";
		
		
		stVO.view(2020);
	}

}
