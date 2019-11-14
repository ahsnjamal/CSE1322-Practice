package T3Recursion;

public class Factorial {
	static int factorial (int n) {
		System.out.println(n);
		if (n ==1) {
			return 1;
		}
		else {
			int result = n*factorial(n-1);
			System.out.println(n);
			return result;
		}
	}
	
	public static void main(String [] args) {
		int f = factorial (5);
		System.out.println(f);
	}
}
