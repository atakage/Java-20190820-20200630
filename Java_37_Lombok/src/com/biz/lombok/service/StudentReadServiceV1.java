package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Getter;


@Getter
public class StudentReadServiceV1 {
	
	
	private List<StudentVO> stdList;
	
	public StudentReadServiceV1() {
		// TODO Auto-generated constructor stub
		stdList = new ArrayList<StudentVO>();
	}
	
	public List<StudentVO> getStdList(){				//추가
		return this.stdList;
	}
	
	
	public void readStudent(String fileName) throws IOException {
		
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		
		
		while(true) {
		String str = br.readLine();
		
		if(str == null) break;
		
		
		String[] strArr = str.split(":");
		
		StudentVO vo = new StudentVO();
		
		vo.setS_dept(strArr[0]);
		vo.setS_name(strArr[1]);
		vo.setS_tel(strArr[2]);
		vo.setS_grade(Integer.valueOf(strArr[3]));
		vo.setS_addr(strArr[4]);
		
		stdList.add(vo);
		
		
		
		}
		
		br.close();
		fr.close();
		
		
	}

}
