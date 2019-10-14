package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.util.ScoreIDX;

public class ScoreServiceV2 {
	
	private Map<String, ScoreVO> scList;
	
	
	public ScoreServiceV2() {
		// TODO Auto-generated constructor stub
		
		
		scList = new TreeMap<String, ScoreVO>(); //추가된 순서에 관계없이 key값을 기준으로 오름차순 정렬
	}
	
	
	public Map<String, ScoreVO> getScList() {
		return this.scList;
	}
	
	public void read(String scoreFileName) throws Exception {
		
		FileReader fr = new FileReader(scoreFileName);
		BufferedReader br = new BufferedReader(fr);
		
		
		String str = new String();
		while(true) {
		
		str= br.readLine();
		if(str == null)break;
		
		String[] strarr = str.split(":");
		
		ScoreVO vo = new ScoreVO();
		
		try {
			
			vo.setNum(strarr[ScoreIDX.NUM]);
			vo.setKorScore(Integer.valueOf(strarr[ScoreIDX.KOR]));
			vo.setEngScore(Integer.valueOf(strarr[ScoreIDX.ENG]));
			vo.setMathScore(Integer.valueOf(strarr[ScoreIDX.MATH]));
			
			
			
			scList.put(strarr[ScoreIDX.NUM]+"", vo);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(strarr[ScoreIDX.NUM]+"학생 성적 입력 오류");
		}
		
		
		
		
		}
		br.close();
		fr.close();
	}
	
	
	public void list() {
		/*
		 * Collections 자료형의 반복문 도와주는 class
		 * Iterator를 사용하면 while() 반복문 사용하여 리스트 처리 가능
		 */
		Set<String> _s = scList.keySet();	//key를 추출하여 set list로 생성
		Iterator<String> _list = scList.keySet().iterator();	//key들을 추출한 set list를 iterator 형으로 변환
		
		
		System.out.println("=========================================");
		System.out.println("성적일람표");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("----------------------------------------");
		while(_list.hasNext()) {
			ScoreVO scVO = scList.get(_list.next());
			System.out.print(scVO.getNum()+"\t");
			System.out.print(scVO.getKorScore()+"\t");
			System.out.print(scVO.getEngScore()+"\t");
			System.out.print(scVO.getMathScore()+"\n");
		}
	}
	
	
	public void total() {
		Set<String> keys = scList.keySet();
		
		for(String key : keys) {
		ScoreVO scVO = scList.get(key);
		int total = scVO.getKorScore() + scVO.getEngScore() + scVO.getMathScore();
		scVO.setSumScore(total);
		scVO.setAverage(total/3);
		}
	}
	
	
	public void listTotal() {
		
		Set<String> keys = scList.keySet();
		System.out.println("========================");
		System.out.println("총점리스트");
		System.out.println("========================");
		System.out.println("학번\t총점\t평균");
		System.out.println("========================");
		for(String key : keys) {
			ScoreVO sVO = scList.get(key);
		System.out.printf("%5s\t%5d\t%5.2f\n", sVO.getNum(), sVO.getSumScore(), sVO.getAverage());
		
		}
	}
	
	public void rank() {
		/*
		 * 데이터가 Map구조로 저장되어 있는 경우 Map Key값으로 정렬하는 것은 문제가 없으나
		 * value 값으로 정렬하기 위해서는 몇 가지 절차가 필요
		 * 1. Map의 value 전체를 추출하여 List로 변환
		 * 2. List를 정렬하고 연산 수행한 다음 다시 List를 Map에 업데이트
		 * 
		 */
		
		
		List<Map.Entry<String, ScoreVO>> sortList = new LinkedList<Map.Entry<String, ScoreVO>>(scList.entrySet());	//Map<String, ScoreVO> type으로 데이터를 가지고 있는 scList값을 List type인 sortList로 변환
																																//Map 형태를 List로 변환시킬 때는 List<Map.Entry<>> 형태로 선언
		
		//List<Map.Entry<String, ScoreVO>> stdList = new LinkedList<>(stdList.entrySet());
		
		Collections.sort(sortList, new Comparator<Map.Entry<String, ScoreVO>>() {
			

			@Override
			public int compare(Entry<String, ScoreVO> o1, Entry<String, ScoreVO> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().getSumScore() - o1.getValue().getSumScore();		//list 형태로 바뀐 Map에서 VO를 추출하는 method
			}
			
		});
		
		int rank = 0;
		for(Map.Entry<String, ScoreVO> vo : sortList) {
			vo.getValue().setRank(++rank);
			System.out.println(vo.getValue().toString());
		}
	}
	
	

}
