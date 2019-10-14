package com.biz.collections.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {
	
	
	public int count;
	private List<String> wordList;
	private String word;
	private List<String> words;  		// character??
	private Scanner scan;
	
	
	public WordService() {
		
		count = 0;
		scan = new Scanner(System.in);
		wordList = new ArrayList<String>();
		wordList.add("yesterday");
		wordList.add("morrning");
		wordList.add("tomorrow");
		wordList.add("school");
		wordList.add("computer");
		wordList.add("human");
		
		
		
	}
	
	public void makeWord() {
		
		Collections.shuffle(wordList);
		word = wordList.get(0);
		
		words = Arrays.asList(word.split(""));
		
		Collections.shuffle(words);
	
		
	}
	
	public boolean input() {
		
		if(count < 1) {
		this.makeWord();
		}
		System.out.println("단어 맞히기 게임");
		System.out.println("=====================");
		System.out.println(words);
		System.out.println("---------------------");
		System.out.print("(-1:END) >> ");
		String strKeyIn= scan.nextLine();
		if(strKeyIn.equals("-1")) {
			return true;
		}
		if(strKeyIn.equalsIgnoreCase(word)) {
			System.out.println(count + "번 만에 맞혔습니다");
			count = 0;
			
		
		}else {
			System.out.println("틀렸습니다");
			count++;
	}
		System.out.println("Press Any Key to Continue....");
		
		scan.nextLine();
		
		
		
		return false;
	}
}
