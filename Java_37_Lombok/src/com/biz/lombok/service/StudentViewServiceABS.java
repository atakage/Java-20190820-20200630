package com.biz.lombok.service;

import java.util.List;


/*
 * 학생정보.txt 파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두개의 정수를 입력받아 해당 범위의 학년에 해당하는 학생들만 콘솔에 보이기
 * 
 * 
 */

import com.biz.lombok.domain.StudentVO;

public abstract class StudentViewServiceABS {

	protected List<StudentVO> stdList;						//protected로 변경

	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}
	
	public abstract void view();
	
	public abstract void view(String strName);
	
	public abstract void view(int intGrade);				// intGrade 정숫값 매개변수로 받아 일치하는 학년 리스트만
	
	public abstract void view(int grGrade, int lessGrade);		// 두 개의 정숫값 매개변수로 받아 해당 범위 학년만 리스트 출력
	

}
