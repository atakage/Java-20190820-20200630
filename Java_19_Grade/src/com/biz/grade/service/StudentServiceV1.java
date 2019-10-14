package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.util.StudentIDX;

public class StudentServiceV1 {
	
	private Map<String,StudentVO> stdList;			//key, value형태로 무작위 데이터 저장
														//put() 저장, get(key) 읽기
	
	public StudentServiceV1() {
		stdList = new TreeMap<String, StudentVO>();	//TreeMap은 put된 데이터를 순서대로 자동 정렬
	}
	
	public Map<String,StudentVO> getStdList() {
		return this.stdList;
	}
	
	public void read(String stdFileName) throws Exception {
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(stdFileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			
			String[] stds = reader.split(":");

			StudentVO stdVO = new StudentVO();
			stdVO.setNum(stds[StudentIDX.NUM]);
			stdVO.setName(stds[StudentIDX.NAME]);
			stdVO.setTel(stds[StudentIDX.TEL]);
			stdVO.setAddr(stds[StudentIDX.ADDR]);
			
			stdList.put(stds[StudentIDX.NUM], stdVO);
			
		}
		buffer.close();
		fileReader.close();
	}
	
	public void list() {
		
		Set<String> stdNums = stdList.keySet();	//map의 key부분만 추출해서 리스트로 볼 수 있도록 변환, 
														//stdList Map에서 Key부분만 추출하여 Set으로 변환
		
		System.out.println("===============================================");
		System.out.println("학생명부");
		System.out.println("------------------------------------------");
		System.out.println("학번\t이름\t전화번호\t주소");
		
		for(String key : stdNums) {
			StudentVO stdVO = stdList.get(key);
			
			System.out.print(stdVO.getNum()+"\t");
			System.out.print(stdVO.getName()+"\t");
			System.out.print(stdVO.getTel()+"\t");
			System.out.print(stdVO.getAddr()+"\n");
		}
	}
	
	public StudentVO getStudent(String strNum) {
		
		return stdList.get(strNum);
		
	}

}
