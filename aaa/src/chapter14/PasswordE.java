package chapter14;

public class PasswordE {
	
	class IDEForMatTest{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDEFormatTest test = new IDEFormatTest();
		
		
		String pass =new String("abc");
		System.out.println(pass.matches("[a-zA-Z]+"));

		String pass2 =new String("abc1");
		System.out.println(pass.matches("[a-zA-Z]+"));

	}

}
