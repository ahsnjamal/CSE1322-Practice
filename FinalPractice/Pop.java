package FinalPractice;

public class Pop {
	class Node{
		int id;
		Node next;
		public Node(int id) {
			this.id = id;
		}
	}
	class Stack{
		Node head;
		Stack(){
			head = null;
		}
		public boolean isEmpty() {
			return (head == null);
		}
		
		public void pop() {
			if(isEmpty()) {
				System.out.println("The stack is empty.");
				return;}
			else {
				this.head = this.head.next;
				System.out.println("Popped "+head);
			}
		}
	}

}
