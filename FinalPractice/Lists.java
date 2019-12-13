package FinalPractice;

public class Lists {
	
	class Node{
		int id;
		Node next;
		public Node (int id) {
			this.id = id;
		}
	}
	
	class LinkedList{
		Node head;
		LinkedList(){
			head =null;
		}
		
		public boolean isEmpty() {
			return(head == null);
		}
		
		public void append(int id) {
			Node newNode = new Node(id);
			if(head == null) {
				head = new Node(id);
				//return;
			}
			newNode.next = null;
			Node last = head;
			while(last.next != null)
				last = last.next;
			last.next = newNode;
			//return;
		}
	}

}
