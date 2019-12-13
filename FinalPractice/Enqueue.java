package FinalPractice;

public class Enqueue {

	class Node{
		int id;
		Node next;
		public Node(int id) {
			this.id = id;
		}
	}
	
	class Queue{
		Node head;
		Node rear;
		Queue(){
			head = null;
			rear = null;
		}
		public boolean isEmpty() {
			return(head==null);
		}
		public void enQueue(int id) {
			Node newNode = new Node(id);
			if(isEmpty()) {
				head = rear = newNode;
				newNode.next = head = rear;
			}else{
				rear.next = newNode;
				newNode.next = head;
				rear = newNode;
			}
		}
	}
}
