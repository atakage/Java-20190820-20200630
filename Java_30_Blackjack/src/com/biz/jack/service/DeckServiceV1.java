package com.biz.jack.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class DeckServiceV1 {

	List<DeckVO> deckList;
	String suit = "다이아몬드(◆):하트(♥):스페이드(♠):클로버(♣)";
	String[] arrSuit = new String[] { "다이아몬드(◆)", "하트(♥)", "스페이드(♠)", "클로버(♣)" };
	String denomination = "A234567890KQJ";

	public DeckServiceV1() {
		// TODO Auto-generated constructor stub
		this.deckList = new LinkedList<DeckVO>();

	}

	public List<DeckVO> getDeck() {

		int nSize = this.deckList.size();

		for (int i = 0; i < nSize; i++) {

			Collections.shuffle(deckList);
		}

		for (DeckVO vo : deckList) {

			Collections.shuffle(deckList);

		}

		return this.deckList;
	}

	public void makeDeck() {

		String[] denoms = denomination.split("");
		for (String suit : arrSuit) {

			for (String denom : denoms) {

				int intValue = 0;

				try {

					intValue = Integer.valueOf(denom);
					
					if(intValue == 0) intValue = 10;

				} catch (Exception e) {
					// TODO: handle exception

					if (denom.equals("A"))
						intValue = 1;
					else
						intValue = 10;

				}
				
				DeckVO vo = new DeckVO();
				vo.setSuit(suit);
				vo.setDenomination(denomination);
				vo.setValue(intValue);
				
				deckList.add(vo);

			}
		}

	}

}
