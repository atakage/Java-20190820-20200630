package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV1 implements WordQuizService{

	protected List<WordVO> wordVOList;

	public WordQuizServiceV1() {
		// TODO Auto-generated constructor stub
		wordVOList = new ArrayList<WordVO>();
	}

	public WordQuizServiceV1(List<WordVO> wordVOList) {

		this.wordVOList = wordVOList;
	}

	public void setWordVOList(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}

	public void viewEngWord()  {
		
		Random rd =new Random();
		int nSize = wordVOList.size();
		int index = rd.nextInt(nSize);
		
		WordVO wordVO = wordVOList.get(index);
		System.out.println(wordVO.getEngWord()+"\t"+wordVO.getKorMeans());
			
		
		System.out.println("===========================================");
			
		}

	@Override
	public void setWordVOList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quizExec() {
		// TODO Auto-generated method stub
		
	}
		
	}


