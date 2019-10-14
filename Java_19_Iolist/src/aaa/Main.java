package aaa;

import com.biz.iolist.service.IolistServiceImpV2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IolistServiceImpV2 ios = new IolistServiceImpV2();
		String fileName = "src/com/biz/iolist/매입매출정보.txt";
		
		
		
		try {
			ios.read(fileName);
			ios.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
