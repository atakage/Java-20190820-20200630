package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.biz.files.domain.ScoreVO;

public class FileGradeServiceV2 extends FileGradeServiceV1{

	@Override
	public void read(String fileName) throws IOException {


		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();	//문자열 변수를 clear할 때는 ""보다 new String() 생성자 사용
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			
			
			String[] scores = reader.split(":");
			
			
			String strNum = scores[0];
			
			int intKor = 0;
			int intEng = 0;
			int intMath = 0;
			try {
				
				intKor = Integer.valueOf(scores[1]);
				intEng = Integer.valueOf(scores[2]);
				intMath = Integer.valueOf(scores[3]);
				
				
			} catch (Exception e) {
				// TODO: handle exception
				//System.out.println(strNum +"번 학생의 점수 확인");
				//break;
				
				throw new NumberFormatException();	//어떤 exception이 발생했는지 호출하는 곳에 구제적으로 알려줌
			}
			
			ScoreVO scoreVO = new ScoreVO();
			
			scoreVO.setStrNum(strNum);
			scoreVO.setIntKor(intKor);
			scoreVO.setIntEng(intEng);
			scoreVO.setIntMath(intMath);
			
			scoreList.add(scoreVO);
			
			
			
			
		}
		buffer.close();
		fileReader.close();
	}
	
	
	public void total() {
		
		for(ScoreVO vo : scoreList) {
			
			int intTotal = vo.getIntKor() + vo.getIntEng() + vo.getIntMath();
			vo.setIntTotal(intTotal);
			vo.setIntAvg(intTotal / 3);
		}
		
	}
	
	public void list() {
		System.out.println("===============================");
		System.out.println("성적일람표");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		
		
		for(ScoreVO vo : scoreList) {
			
			System.out.print(vo.getStrNum()+"\t");
			System.out.printf("%3d\t", vo.getIntKor());
			System.out.printf("%3d\t", vo.getIntEng());
			System.out.printf("%3d\t", vo.getIntMath());
			System.out.printf("%3d\t", vo.getIntTotal());
			System.out.printf("%3d\n", vo.getIntAvg());
			
		}
	}
	
	

}
