package com.biz.word.exec;

import java.util.List;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV1;
import com.biz.word.service.WordQuizServiceV2;

public class WordEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordListMakeService wm = new WordListMakeService();
		WordQuizServiceV1 wmV1 = new WordQuizServiceV1();
		WordQuizService wqV2 = new WordQuizServiceV2();
		
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		try {
			wm.makeWordList(wordFileName);
			
			List<String> wordStrList = wm.getWordStrList();
			List<WordVO> wordVOList = wm.getWordVOList();
			
			wmV1.setWordVOList(wordVOList);
			wmV1.viewEngWord();
			
		
			((WordQuizServiceV2)wqV2).setWordVOList(wordVOList);
			wqV2.viewEngWord();
			wqV2.quizExec();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
