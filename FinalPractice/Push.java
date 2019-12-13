package FinalPractice;

public class Push {

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
		
		public void push(int x) {
			Node newNode = new Node(x);
			newNode.next = null;
			if(isEmpty()) {
				head = newNode;
			}
			else {
				newNode.next = head;
				head = newNode;
			}
		}
	}
}
