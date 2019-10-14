package com.biz.single.service;

public class SingleClassV1 {			// thread 환경에서 불안정한 상태

	private static SingleClassV1 myObject = new SingleClassV1();;

	private SingleClassV1() {
		// TODO Auto-generated constructor stub

		// this.myObject

	}

	public static SingleClassV1 getInstance() {

		return myObject;
	}
	
	

}
