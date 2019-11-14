package T3Recursion;

public class DoWork {
	static void doWork(int i) {
		System.out.println(i);
		if(i > 2) {
			doWork(i-1);
			doWork(i-2);
		}
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		doWork(4);
	}
}
