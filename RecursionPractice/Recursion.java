package RecursionPractice;

public class Recursion {
	static void print(int test) {
		if (test < 1)
			return;
		else {
			System.out.print(test);
			print(test - 1);
			
			System.out.print(test);
			return;
		}
	}
	public static void main(String [] args) {
		int test = 3;
		print(test);
	}
}