package com.biz.grade.util;

public class StudentIDX {	//static class의 또다른 용도로 숫잣값을 사용해야 할 곳(배열)에 static 변수를 지정하여
												//사용 가능(가독성 좋아짐)
	public final static int NUM = 0;		//final 선언 시 이후에 값을 변경 삭제 불가능(상수화)
	public final static int NAME = 1;			//member 변수에 static 부착 시 이 변수가 포함된 클래스는 자동으로 static class
	public final static int TEL = 2;
	public final static int ADDR = 3;

}
