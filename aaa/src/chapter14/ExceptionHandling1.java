package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {fis.close();}catch(IOException e) {e.printStackTrace();}
		}
		
		
		
	}

}
