package f;

public class TestMain {

		// TODO Auto-generated method stub
		
		School goodSchool = School.getInstance();
		Subject00 korean;
		Subject00 math;
		GenerateGradeReport gradeReport = new GenerateGradeReport();
		
		
		
		public static void main(String[] args) {
			
			TestMain test = new TestMain();
			
			test.createSubject();
			test.createStudent();
			
			String report = test.gradeReport.getReport();
			System.out.println(report);
		}
		
		public void createSubject() {
			korean = new Subject00("국어", Define.KOREAN);
			math = new Subject00("수학", Define.MATH);
			
			goodSchool.addSubject(korean);
			goodSchool.addSubject(math);
		}
		
		public void createStudent() {
			Student student = new Student(181213, "안", korean);
			Student student2 = new Student(281213, "오", math);
			
			goodSchool.addStudent(student);
			goodSchool.addStudent(student2);
			
			
			korean.register(student);
			korean.register(student);
			
			math.register(student);
			math.register(student2);
			
			addScoreForStudent(student, korean, 95);
			addScoreForStudent(student, math, 56);
			
			addScoreForStudent(student2, korean, 95);
			addScoreForStudent(student2, math, 95);
			
			
		}
		
		
		
		public void addScoreForStudent(Student student, Subject00 subject, int point) {
			
			Score score = new Score(student.getStudentId(), subject, point);
			student.addSubjectScore(score);
			
		}
	

}
