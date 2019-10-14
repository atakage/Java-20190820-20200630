package com.biz.lombok.exec;

import java.io.IOException;
import java.util.List;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;

public class StudentEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceABS sView = new StudentViewServiceV1();
		
		
		
		String fileName = "src/com/biz/lombok/학생정보.txt";
		
		try {
			sRead.readStudent(fileName);
			List<StudentVO> stdList = sRead.getStdList();
			
			sView.setStdList(stdList);
			
			//sView.view();
			//sView.view("홍길동");
			
			//sView.view(3);
			//sView.view(2, 1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
						
	}

}
