package aaa;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s = new Student("Lee", 1001);
		s.addSubject("국어", 100);
		s.addSubject("수학", 50);
		
		Student s2 = new Student("Park", 1002);
		s2.addSubject("국어", 70);
		s2.addSubject("수학", 85);
		s2.addSubject("영어", 100);
		
		s.showStudentInfo();
		System.out.println("============================");
		s2.showStudentInfo();
	}

}
