package com.biz.classes.service.parents;


/*
 * 추상클래스
 * 클래스는 클래스인데 미완성된 클래스
 * 
 * 주요 용도는 상속받은 곳에서 method 및 변수를  사용하게 하는 것
 * 인터페이스의 역할도 수행함(주요 기능 구현X 그러나 꼭 필요하니 구현하라는 설계도 역할)
 * 부모 클래스 역할(상속 시) + 인터페이스?
 */

public abstract class RemoconABSV2 {
	
	protected String name;
	
	public RemoconABSV2() {
		// TODO Auto-generated constructor stub
		this.name = "나는 리모컨입니다";
	}
	
	

	public void power() {
		System.out.println(name);
	}



	public abstract void volUp();



	public abstract void volDown();



	public abstract void Chup();



	public abstract void ChDown();



	public abstract void setName(String string);
	
}