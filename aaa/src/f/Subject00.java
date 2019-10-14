package f;

import java.util.ArrayList;

public class Subject00 {
	
	private String subjectName;
	private int subjectId;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject00(String subjectName, int subejctId) {
		this.subjectName = subjectName;
		this.subjectId = subejctId;
		this.gradeType = Define.AB_TYPE;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}

}
