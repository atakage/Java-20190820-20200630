package aaa;

import java.util.ArrayList;

public class Test_03 {
	
	public static void main(String[] args) {
		
		char[] c = new char[26];
		char ch = 'A'+ 32;
		
		for(int i = 0; i <c.length; i++, ch++) {
			
			c[i] = ch;
			

		}
		
		for(int i = 0; i <c.length; i++) {
			System.out.println(c[i]+","+(int)c[i]);
		}
		
	}

}
