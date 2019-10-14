package com.biz.classes.model;

public class AddressVO {
	
	public String address;
	public String name;
	public String number;
	public String rel;

	
	
	public void printAdr() {
		
		System.out.printf("%s\t%s\t%s\t%s\n", name, number, address, rel);
		
	}
}
