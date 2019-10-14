package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListRecServiceV2 {
	
	private String name;
	private List<String> myStrList;
	private List<String> recStrList; 
	
	public ListRecServiceV2() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	public ListRecServiceV2(List<String> recStrList, String name) {
		// TODO Auto-generated constructor stub
		
		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;
		this.name = name;
		
	}
	
	
	
	public void remove() {
		this.myStrList.add(this.recStrList.get(0));
		this.recStrList.remove(0);
	}

	
	public void viewList() {
		
		System.out.println("==========================");
		System.out.println(this.name);
		System.out.println("=========================");
		System.out.println(myStrList.toString());
		System.out.println(recStrList.toString());
		}
	}


