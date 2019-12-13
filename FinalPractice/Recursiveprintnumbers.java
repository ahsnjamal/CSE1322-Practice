package FinalPractice;

public class Recursiveprintnumbers {
	
	static void printNumbers(int x) {
		if(x > 1)
			printNumbers(x-1);
		System.out.print(x*x+" ");
	}
	
	public static void main(String[]args) {
		printNumbers(5);
	}
}
