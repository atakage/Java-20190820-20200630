package com.biz.collections.exec;

import com.biz.collections.service.WordService;

public class WordQuiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WordService ws = new WordService();
		
		
		while(true) {
		ws.input();
		
			if(ws.input() == true) {
				break;
			}

		}
		
		System.out.println("게임 종료");
	}

}
