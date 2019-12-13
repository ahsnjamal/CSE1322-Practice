package FinalPractice;

public class ExceptionHandling {
	
	static int divideByZero(int a, int b) {
		int i = a/b;
		return i;
	}
	
	static int Division(int a, int b) {
		int res = 0;
		
		try {
			res = divideByZero(a,b);
		}catch(NumberFormatException ex) {
			System.out.println("Number format error has occured.");
		}
		return res;
	}
	
	public static void main(String[]args) {
		int a = 1;
		int b = 0;
		
		try {
			int i = Division(a,b);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
