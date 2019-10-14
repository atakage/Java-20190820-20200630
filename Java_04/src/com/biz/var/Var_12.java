package com.biz.var;

public class Var_12 {
	
	public static void main(String[] args) {
		
		int nCount = 0;
		
		nCount = nCount + 1;
		System.out.println("카운트1:"  + nCount);
		
		nCount +=1;
		System.out.println("카운트2:"+ nCount);
		
		System.out.println("카운트3:"+ (nCount++));
		System.out.println("카운트4:" + nCount);
		System.out.println("카운트5:" + (++nCount));
		
		
		int n = (nCount++)+1;
		
		
		
	}
}
