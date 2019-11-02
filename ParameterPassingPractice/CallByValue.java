package ParameterPassingPractice;

class CallByValue {
	public void Example(int x, int y) {
		x++;
		y++;
	}
}

class TestVal{
	public static void main (String [] args) {
		
		int a = 10;
		int b = 20;
		
		CallByValue objectOne = new CallByValue();
		System.out.println("The value of a is: " +a+" & the value of b is: " +b);
		
		objectOne.Example(a,b);
		System.out.println("The value of a is: " +a+" & the value of b is: " +b);
	}
}
