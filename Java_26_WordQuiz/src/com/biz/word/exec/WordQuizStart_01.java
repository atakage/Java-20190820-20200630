package com.biz.word.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizServiceV1;
import com.biz.word.service.WordQuizServiceV2;

public class WordQuizStart_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WordListMakeService wlm = new WordListMakeService();
		
		WordQuizServiceV1 wqV2 = new WordQuizServiceV2();
		
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		
		Scanner scan = new  Scanner(System.in);
		
		try {
			
			wlm.makeWordList(wordFileName);
			
			List<WordVO> list = wlm.getWordVOList();
			wqV2.setWordVOList(list);
			
			
			
			while(true) {
				
				System.out.println("==========================");
				System.out.println("행복나라 영어 정복");
				System.out.println("==========================");
				
				wqV2.viewEngWord();
				wqV2.quizExec();
				
				System.out.println("아무키나 누르세요.... 종료(-0)");
				String strKey = scan.nextLine();
				if(strKey.equals("-0")) break;
			}
			
			System.out.println("게임 오버");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
