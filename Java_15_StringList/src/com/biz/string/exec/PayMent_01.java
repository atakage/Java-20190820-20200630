package com.biz.string.exec;

public class PayMent_01 {

	public static void main(String[] args) {

		int pay = 3785870;

		int mo = 50000;
		int moc = 5;

		int fcount = 0;
		int count;
		
		

		while (pay > 0) {

			if (fcount == 0) {
				count = pay / mo;
				System.out.println(mo + "원권:" + count);
				pay = pay - count * mo;
				
				fcount = 1;

			}
			
			
			
			switch(moc) {
			  case	5:
				  mo = mo / moc;
					count = (int)(pay / mo);
					System.out.println(mo + "원권:" + count);
					pay = pay - count * mo;
					moc = moc - 3;
					
			  case	2:
				  mo = mo / moc;
					count = (int)(pay / mo);
					System.out.println(mo + "원권:" + count);
					pay = pay - count * mo;
					moc = moc + 3;		
							
					
			}
			
			
			
			
			
			
			

		}

	}

}
