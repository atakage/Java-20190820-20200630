package com.biz.pay.domain;

public class PaperVO {

	private String paper; // 액면가
	private int count; // 매수

	public PaperVO() {

	}

	public PaperVO(String paper, int count) {	// 필드 생성자: 필드 변수를 주입받아서 값을 설정
		super();
		this.paper = paper;
		this.count = count;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "PaperVO [paper=" + paper + ", count=" + count + "]";
	}

}
