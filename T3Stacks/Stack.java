package T3Stacks;

public class Stack {
	static final int max = 1000;
	int top;
	int a[] = new int[max];
	
	boolean isEmpty(){
		return (top < 0);
	}
	
	void stack(){
		top = -1;
	}
	
	boolean push(int x) {
		if(top >= (max - 1)) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x+" pushed into the stack.");
			return true;
		}
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
}

class Main{
	public static void main(String [] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop()+" popped from the stack.");
	}
}

