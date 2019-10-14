package com.biz.jack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.utils.BlackjackUtils;

public class GameServiceV1 {

	DeckServiceV1 ds;
	List<DeckVO> deckList;
	Scanner scanner;

	public GameServiceV1() {
		// TODO Auto-generated constructor stub
		ds = new DeckServiceV1();
		ds.makeDeck();
		deckList = ds.getDeck();
		scanner = new Scanner(System.in);

	}

	public boolean gameStart(String playerName) {

		System.out.println(BlackjackUtils.getStringLong("=", 100));
		System.out.println("Game Start");
		System.out.println(BlackjackUtils.getStringLong("=", 100));

		PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
		PlayerServiceV1 타짜 = new PlayerServiceV1(deckList, playerName);

		for (int i = 0; i < 2; i++) {

			딜러.hit();

			타짜.hit();

		}

		if (타짜.sumValue() > 21) {
			System.out.println("블랙잭 플레이어 승리!");
			return true;
		}

		if (딜러.sumValue() > 21) {
			System.out.println("블랙잭 딜러 승리");
			return true;
		}

		while (true) {

			// if(타짜.sumValue() > 21) break;

			if (타짜.sumValue() > 21) {
				System.out.println(" 플레이어 승리!");
				return true;
			}

			if (딜러.sumValue() > 21) {
				System.out.println("딜러 승리");
				return true;
			}

			if (타짜.sumValue() == 딜러.sumValue()) {
				System.out.println("딜러 승리");
			}

			System.out.println("============================");
			System.out.println("1. Hit     2. Stand     3. 종료");
			System.out.println("----------------------------");
			System.out.print("선택>> ");
			String strM = scanner.nextLine();
			int intM = Integer.valueOf(strM);

			if (intM == 1) {

				딜러.hit();

			} else {

				while (타짜.sumValue() > 17) {

					타짜.hit();

				}

				if (타짜.sumValue() == 딜러.sumValue()) {
					System.out.println("동점으로 딜러 승");
				} else if (타짜.sumValue() > 딜러.sumValue()) {
					System.out.println(playerName + " 승리!!");
				} else {
					System.out.println("딜러 승리");
				}

				System.out.println(BlackjackUtils.getStringLong("*", 100));
				System.out.println("딜러 점수:" + 딜러.sumValue());
				System.out.println(playerName + "점수:" + 타짜.sumValue());

				if (타짜.sumValue() > 21) {
					System.out.println(" 플레이어 승리!");
					return true;
				}

				if (딜러.sumValue() > 21) {
					System.out.println("딜러 승리");
					return true;
				}

				if (intM == 2)
					return true;
				else if (intM == 3)
					return false;
			}

			System.out.println("아무키나 누르세요");
			scanner.nextLine();

		}

	}

}
