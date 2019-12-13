package LabFinalReview;

public class Recursion {
	public static void PrintNumbers(int n){
		if (n > 0){
		System.out.println(n + " ");
		PrintNumbers(n - 1);
		System.out.println(n + " ");
			}
		}

public static void main(String[]args) {
	PrintNumbers(4);
}
}
