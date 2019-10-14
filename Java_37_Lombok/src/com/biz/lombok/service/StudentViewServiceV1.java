package com.biz.lombok.service;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
		
		System.out.println("========================");
		System.out.println("학생 리스트");
		System.out.println("학번\t이름\t전화번호\t학년\t주소");
		System.out.println("====================================");

		for (StudentVO vo : stdList) {
			
			this.bodyPrint(vo);
			
		}

	}

	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub
		
		System.out.println("========================");
		System.out.println(strName + " 학생 정보");
		System.out.println("학번\t이름\t전화번호\t학년\t주소");
		System.out.println("====================================");

		for (StudentVO vo : stdList) {

			if (vo.getS_name().equalsIgnoreCase(strName)) {

				
				this.bodyPrint(vo);

			} 
		}

	}

	@Override
	public void view(int intGrade) {
		// TODO Auto-generated method stub
		
		System.out.println("========================");
		System.out.println(intGrade+"학년 학생 리스트");
		System.out.println("학번\t이름\t전화번호\t학년\t주소");
		System.out.println("====================================");

		for (StudentVO vo : stdList) {

			if (vo.getS_grade() == intGrade) {

				
				this.bodyPrint(vo);

			} 

		}

	}

	@Override
	public void view(int grGrade, int lessGrade) {
		// TODO Auto-generated method stub
		
		
		System.out.println("========================");
		System.out.println(lessGrade+ " ~ " + grGrade+"학년 학생 리스트");
		System.out.println("학번\t이름\t전화번호\t학년\t주소");
		System.out.println("====================================");

		for (StudentVO vo : stdList) {

			if (vo.getS_grade() <= grGrade && vo.getS_grade() >= lessGrade) {

				
				this.bodyPrint(vo);

			}

		}

	}
	
	public void bodyPrint(StudentVO vo) {
		
		
		System.out.print(vo.getS_dept() + "\t");
		System.out.print(vo.getS_name() + "\t");
		System.out.print(vo.getS_tel() + "\t");
		System.out.print(vo.getS_grade() + "\t");
		System.out.print(vo.getS_addr() + "\n");
		
		
	}

}
