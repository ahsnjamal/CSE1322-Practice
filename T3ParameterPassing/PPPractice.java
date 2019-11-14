package T3ParameterPassing;

public class PPPractice {

	static void B (int x) {
		x+=9;
		System.out.println(x);
	}
	
//	static void C (ref int y) {
//		y+=9;
//		System.out.println(y);
//	}
	
	public static void main(String [] args) {
		int a = 42;
		System.out.println (a);
		B(a); //51 because it only calls the value, does not change it.
		System.out.println (a); //42
		
//		int b = 42;
//		System.out.println (b);
//		C(ref b); //51, but is changed because the ref notation.
//		System.out.println (b); //51 because b is now 42+9 via the C method.
	}
}
