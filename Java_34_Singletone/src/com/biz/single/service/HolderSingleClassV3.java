package com.biz.single.service;

/*
 * 
 * thread 환경에서 안전성을 보장 = 동기화 보장
 * 
 * thread 환경에서 개발자가 동기화 문제를 직접 해결하는 것은 힘듦
 * 
 * 다양한 방법으로 thread safe하기 위해 여러가지 도구를 사용
 * 
 * 운영체제에 관리를 맡기는 방법을 사용했지만 JVM환경에서 좋은 패턴이 아님(운영체제마다 메모리 관리 방법이 달라 호환성에 문제)
 *
 * Holder 방식은 JVM의 초기화 과정에서 원자적 특성을 이용해 싱글톤 클래스의 초기화와 thread 관련된 문제에 대한 책임을
 * 전적으로 JVM에 일임시킴
 * 
 * 코드가 간단하고 안정적이어서 최근에 가장 많이 사용
 * 
 */

public class HolderSingleClassV3 {
	
	private HolderSingleClassV3() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	private static class InnerHolder{	// 클래스 내부에 존재하는 클래스
		public static final HolderSingleClassV3 INSTANCE = new HolderSingleClassV3();
	}
	
	public static HolderSingleClassV3 getInstance() {
		
		return InnerHolder.INSTANCE;
	}
	
	public void viewName() {
		System.out.println("나는 싱글톤");
	}

}
