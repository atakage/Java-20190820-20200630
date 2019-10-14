package com.biz.collections.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordQuiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strWord = "yesterday";
		String[] words = strWord.split("");
		
		for(int i =0; i <words.length; i++) {
			System.out.println(words[i]);
		}
		
		
		List<String> alphaList =  Arrays.asList(words);
		System.out.println(alphaList);

		
		
		Collections.shuffle(alphaList);
		System.out.println(alphaList);
	}

}
