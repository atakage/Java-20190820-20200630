package chapter14;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		
		try (AutoClose ac = new AutoClose()) {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외");
		}
		
	}

}
