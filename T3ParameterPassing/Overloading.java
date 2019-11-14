package T3ParameterPassing;

public class Overloading {
	
	static float tryMe(int x) {
		return x + .375f;
	}
	
	static float tryMe(int x, float y) {
		return x*y;
	}
	
	public static void main (String[] args) {
		float result = tryMe(25, 4.32f);
		System.out.println(result); //returns 108.00001 because the method used has two arguments.
	}
}
