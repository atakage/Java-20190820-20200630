package aaa;

import java.util.ArrayList;


import javax.security.auth.Subject;

public class Student {
	
	private int studentId;
	private String name;
	private String subject;
	
	ArrayList<Subject2> subjectList;
	
	public Student(String name, int studentId) {
		
		this.name = name;
		this.subject = subject;
		subjectList = new ArrayList<Subject2>();
	}
	
	public void addSubject(String name, int score) {
		
		Subject2 subject = new Subject2();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject2 s: subjectList) {
			
			total += s.getScorePoint();
			System.out.println("학생" + name + "의" + s.getName()+ "과목 성적은" + s.getScorePoint());
			
		}
		
		System.out.println("학생"+ name + "의 총점은" + total);
	
	}
	

}
