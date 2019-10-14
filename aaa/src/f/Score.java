package f;

public class Score {
	
	int studentId;
	Subject00 subject;
	int point;
	
	
	public Score(int studentId, Subject00 subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public Subject00 getSubject() {
		return subject;
	}


	public void setSubject(Subject00 subject) {
		this.subject = subject;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	
	public String toString() {
		return "학번:" + studentId + "," + subject.getSubjectName() + ":" + point;
	}
	

}
