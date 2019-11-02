package ParameterPassingPractice;

class CallByReference {
	int a,b;
	
	CallByReference(int x, int y){
		a = x;
		b = y;
	}
	
	void changeValue(CallByReference object) {
		object.a += 10;
		object.b += 20;
	}
}
	
class TestRef{
		public static void main(String [] args) {
			CallByReference object = new CallByReference(10, 20);
			System.out.println("The value of a is: " +object.a+ " & b is: " +object.b);
			
			object.changeValue(object);
			System.out.println("The value of a is: " +object.a+ " & b is: " +object.b);
		}
	}