package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.word.domain.WordVO;

public interface WordQuizService {

	public void setWordVOList();

	public void viewEngWord();
	
	public void quizExec();
	
	

}
