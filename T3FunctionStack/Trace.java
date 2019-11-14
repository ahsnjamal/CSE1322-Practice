package T3FunctionStack;

public class Trace {
	
		static void method2() {
			System.out.println("Method 2 was called.");
		}
		static void method1() {
			System.out.println("Method 1 was called.");
			method2();
			System.out.println("Method 1 is still alive.");
		}
		public static void main(String[] args) {
			method2(); // pushes method 2 into stack, prints and then ends.
			method1();// pushes method 1 into stack, prints line 9, calls method 2, 
//			prints line 6 and ends method 2, then method 1 prints line 11 
//			and ends, then the main prints line 18.
			System.out.println("Finished.");
		}
	}
