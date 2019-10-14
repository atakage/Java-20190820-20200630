package com.biz.jack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class PlayerServiceV1 {

	List<DeckVO> myDeckList;
	List<DeckVO> publicDeckList;

	String playerName;

	public PlayerServiceV1(List<DeckVO> deckList) {
		this(deckList, "딜러");
	}

	public PlayerServiceV1(List<DeckVO> deckList, String playerName) {
		// TODO Auto-generated constructor stub

		myDeckList = new ArrayList<DeckVO>();

		this.publicDeckList = deckList;
		this.playerName = playerName;

	}

	public int sumValue() {

		int sumValue = 0;
		for (DeckVO vo : myDeckList) {
			sumValue += vo.getValue();
		}

		return sumValue;

	}

	public void hit() {
		
		if(this.playerName.equals("딜러") && this.sumValue() > 16) {
			
			System.out.println("딜러 점수:" + sumValue());
			System.out.println("딜러 히트 금지");
		}else {
			
			myDeckList.add(publicDeckList.get(0));
			publicDeckList.remove(0);
		}
		
		System.out.println("============================================");
		System.out.println(playerName);
		System.out.println("============================================");
		
		for(DeckVO vo : myDeckList) {
			System.out.println(vo);
		}
		
		System.out.println("--------------------------------");
		System.out.println("현재 점수:" + this.sumValue());

	}
}
