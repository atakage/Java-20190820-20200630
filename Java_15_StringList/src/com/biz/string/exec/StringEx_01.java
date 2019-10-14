package com.biz.string.exec;

public class StringEx_01 {
	
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		String[] strS1 = strNation.split("");
		
		for(String s : strS1) {
			
			System.out.println(s);
		}
		
		
		String[] strS2 = strNation.split(" ");
		
		System.out.println("0:"+strS2[0]);
		System.out.println("1:"+strS2[1]);
		System.out.println("2:"+strS2[2]);
		
	
		
		try {
			System.out.println("3:"+ strS2[3]);
		} catch (Exception e) {
			// TODO: handle exception		//try{}내 코드가 실행되는 과정에서 exception이 발생하면
			e.printStackTrace();				//JVM은 catch(e){} 블럭에 exception 정보를 전달
		}
	}

}
