package com.biz.classes.search;

import java.util.Scanner;

public class SearchMain {
	
	public static void main(String[] args) {
		
		SearchSub ss = new SearchSub();
		ss.strNation = "UNITED NATION";
		Scanner scanner = new Scanner(System.in);
		String command = "";
		
		//for(;;) {
		
		while(3==3){
		ss.main();
		
		System.out.println("=========================");
		System.out.print("게속 하려면 아무 키나 누르세요(END 종료): ");
		command = scanner.nextLine();
		if(command.equals("END"))
			break;
		else
			continue;
		}
		
		System.out.println("GAME OVER");
	}	
	
	
}
