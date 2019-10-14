package f;

import java.util.ArrayList;
import java.util.List;



public class School {
	
	private static School instance = new School();
	
	private List<Student> studentList = new ArrayList<Student>();
	private List<Subject00> subjectList = new ArrayList<Subject00>();
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
			return instance;
	}
		return instance;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject00 subject) {
		subjectList.add(subject);
	}


	public void setSubjectList(List<Subject00> subjectList) {
		this.subjectList = subjectList;
	}

	public List<Subject00> getSubjectList() {
		return subjectList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	

	
	
	
	
	

}
