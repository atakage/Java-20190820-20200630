package com.biz.classes.exec;

public class ClassEx_01 {
	
	static String strName = "홍길동";

	public static void main(String[] args) {	// main()은 static method이며 프로젝트가 시작하면 JVM이 제일먼저 찾아 실행
												// static으로 설정된 method에서 필드 변수에 접근하려면 필드 변수도 static으로 선언해야 함
		
		strName = "이몽룡";
		getName(strName);					// 전달된 파라미터 값은 method 내부로 복사됨
											  
		System.out.println(strName);			

	}
	
	public static void getName(String strName) {	// static으로 선언된 method에서 다른 method를 호출하려면 호출되는 method도 모두 static으로 선언되어야 함
		
		System.out.println(strName);
		strName = "성춘향";			// getName() 메서드 내부에서 strName 변수의 값을 변경해도 main() method에서 참조하는
								//strName 변수의 값은 변동X(Call By Value)
	}

}
