package com.biz.classes.student;

import java.util.ArrayList;

public class StudentMain {
	
	public static void main(String[] args) {
		
		
		Student sd = new Student();
		Student sd2 = new Student();
		
		sd.setName("학생A");
		sd.setNum("10000");
		sd.setSubject("컴퓨터");
		sd.setYear(2017);
		
		sd2.setName("학생B");
		sd2.setNum("10001");
		sd2.setSubject("물리");
		sd2.setYear(2018);
		
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(sd);
		list.add(sd2);
		
		System.out.println("-학생 리스트");
		System.out.println("학번\t이름\t입학년도\t전공\t학년\n");
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).Studentlist();
		}
		
		System.out.println("===============");
		System.out.println("-"+sd.getName()+"의 정보");
		sd.PersonalList();
		
		
	}
	
	
	


}
