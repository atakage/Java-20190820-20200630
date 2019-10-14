package aaa;

public class FunctionTest {

	public static void main(String[] args) {
	
		int num = 10;
		int num2 = 20;
		
		int sum = add(num, num2);
		System.out.println(sum);
	
	}	
	public static int add(int num, int num2) {
		
		int result = 0;
		
		result = num + num2;
		
		return result;
	}
}