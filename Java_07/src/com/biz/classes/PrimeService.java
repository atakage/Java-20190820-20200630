package com.biz.classes;

import java.util.Scanner;

public class PrimeService {
	
	
	

	public void checkPrime(int number) {
		
	
	
	int index;
	for(index = 2; index < number; index++) {
		if(number % index == 0)break;
		
	}
	
	if(index >= number)
		System.out.println(number+"는 소수");
	else 
		System.out.println(number+"는 소수가 아님");
	
}
	
	
	
	
}
