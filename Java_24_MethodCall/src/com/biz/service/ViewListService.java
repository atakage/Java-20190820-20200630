package com.biz.service;

import java.util.List;

public class ViewListService {
	
	public void setListAll() {
		
		System.out.println("나는 하는 일이 하나도 없다네");
	}
	
	public int setListAllAndView(List<Integer> intList) {
		
		int nSize = intList.size();
		
		for(int i : intList) {
			System.out.println(i);
		}
		
		return nSize;
	}

}
