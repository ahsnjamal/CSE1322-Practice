package T3Recursion;

public class Fibonacci {
	static int Fib(int i) {
		if (i == 1)
			return 0;
		else if (i == 2)
			return 1;
		else
			return Fib(i-1)+Fib(i-2);
			}
	public static void main(String [] args) {
		System.out.println(Fib(4));
	}
}
