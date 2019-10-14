package com.biz.pay.domain;

public class PaperVO {
	
	private String member;
	private String paper; // 액면가(50000)
	private int count; // 액면가에 대한 화폐 매수
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
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	

}
