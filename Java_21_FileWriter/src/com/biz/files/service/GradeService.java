package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.files.domain.ScoreVO;

public interface GradeService {

	public void makeScoreFile(String scoreName, int length) throws Exception;
	
	
	public void readNameFile(String nameFile) throws Exception;
	
	
	public void makeStudentFile(String StudentFile, int length) throws Exception;

}