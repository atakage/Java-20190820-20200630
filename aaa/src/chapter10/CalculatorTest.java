package chapter10;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		CompleteCalc cc = new CompleteCalc();
		System.out.println(cc.add(num1, num2));
		System.out.println(cc.substract(num1, num2));
		System.out.println(cc.times(num1, num2));
		System.out.println(cc.divide(num1, num2));
		cc.showInfo();
		
		Calc cc2 = new CompleteCalc(); 
		
		
		cc.description();
	}

}
