package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.word.domain.WordVO;

public class WordListMakeService {
	
	protected List<String> wordStrList;
	protected List<WordVO> wordVOList;
	
	
	
	
	
	public WordListMakeService() {
		// TODO Auto-generated constructor stub
		
		wordStrList = new ArrayList<String>();
		wordVOList = new ArrayList<WordVO>();
	}
	
	
	
	public void makeWordList(String wordFileName) throws Exception {
		
		
		FileReader fileReader = new FileReader(wordFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		
		String reader = new String();
		while(true) {
			
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] words = reader.split(":");
			
			String word = String.format("%s:%s", words[1], words[2]);
			
			WordVO wordVO = new WordVO();
			
			wordVO.setEngWord(words[1]);
			wordVO.setKorMeans(words[2]);
			
			
			wordVOList.add(wordVO);
			
		}
		
		buffer.close();
		fileReader.close();
		
		
		
	}



	public List<String> getWordStrList() {
		return wordStrList;
	}



	public List<WordVO> getWordVOList() {
		return wordVOList;
	}

}
