package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV2 extends WordQuizServiceV1 {

	// List<WordVO> wordVOList;

	/*
	 * public void setWordVOList(List<WordVO> wordVOList) { this.wordVOList =
	 * wordVOList; }
	 * 
	 */ int nCount;
	protected WordVO vo;
	Scanner scan;

	public WordQuizServiceV2() {

		scan = new Scanner(System.in);
		nCount = 0;
	}

	public void viewEngWord() {

		if (nCount > 0) {

			System.out.println();
			this.viewEngWord(vo);
			return;
		}

		int size = wordVOList.size();

		Random rd = new Random();
		int rdVal = rd.nextInt(size);
		vo = new WordVO();

		vo = wordVOList.get(rdVal);

		String strWord = vo.getEngWord();
		// int strWordSize = strWord.length();
		// Random rd = new Random();

		// int rdVal = rd.nextInt(strWordSize);

		String[] strArr = strWord.split("");

		List<String> list = Arrays.asList(strArr);

		Collections.shuffle(list);

		System.out.println("답:" + strWord);

		System.out.print("제시 단어:");
		for (String s : list) {
			System.out.print(s);
		}

	}

	private void viewEngWord(WordVO vo) { // 단어 무작위 섞는 부분

		String strWord = vo.getEngWord();
		// int strWordSize = strWord.length();
		// Random rd = new Random();

		// int rdVal = rd.nextInt(strWordSize);

		String[] strArr = strWord.split("");

		List<String> list = Arrays.asList(strArr);

		Collections.shuffle(list);

		System.out.println("답:" + strWord);

		System.out.print("제시 단어:");
		for (String s : list) {
			System.out.print(s);
		}

	}

	public void quizExec() {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.print("정답 입력:");
		String str = scan.nextLine();
		
		

		if (str.equalsIgnoreCase(vo.getEngWord())) {
			System.out.println("정답");
			System.out.println("시도 횟수:" + (nCount + 1));
			System.out.println("-----------------------------");
			System.out.println(vo.getKorMeans());
			nCount = 0;
		} else {

			System.out.println((nCount + 1) + "번 틀렸음");
			System.out.println("계속(enter), 힌트보기(H)>> ");
			String strH = scan.nextLine();
			if (strH.equalsIgnoreCase("h")) {

				System.out.println(vo.getKorMeans());
			}

			nCount++;

			/*
			 * while (true) { System.out.print("정답 다시 입력(종료는 0):");
			 * 
			 * str = scan.nextLine();
			 * 
			 * if (str.equals("0")) break; if (str.equalsIgnoreCase(vo.getEngWord())) {
			 * System.out.println("정답!"); break; }
			 */
		}
	}

}
