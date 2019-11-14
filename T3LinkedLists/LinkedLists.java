package T3LinkedLists;

public class LinkedLists {
	private Node first;
	class Node{
		public int num;
		public Node next;
	}
	
	public LinkedLists() {
		first = null;
	}
	
	public void addNode(int n) {
		Node newNode = new Node();
		newNode.num = n;
		newNode.next = first;
		first = newNode;
	}
	
	public void addBack(int n) {
		Node temp = new Node();
		temp.num = n;
		Node current = first;
		while(current.next != null)
			current = current.next;
		current.next = temp;
	}
	
	public void remove(int n) {
		Node current = first;
		Node previous = current;
		if(current.num == n) {
			first = current.next;
			return;
			}
		while(current.num != n) {
			previous = current;
			current = current.next;
			if(current == null) {
				return;
			}
			previous.next = current.next;
		}
	}
	
	public String display() {
		Node current = first;
		String data = "";
		while(current.next != null) {
			data += " "+current.num+" --> ";
			current = current.next;
		}
		data += " "+current.num+" --> " ;
		return data;
	}
	
	public static void main(String[] args) {
		LinkedLists LL = new LinkedLists();
		System.out.println(LL);
		
		LL.addNode(5);
		LL.addNode(7);
		LL.addNode(1);
		LL.addNode(4);
		
		System.out.println("Display 1 " +LL+" "+LL.display());
		
		LL.remove(4);
		System.out.println("Display 2 " +LL+" "+LL.display());
		
		LL.remove(7);
		System.out.println("Display 3 " +LL+" "+LL.display());
		
		LL.addNode(8);
		System.out.println("Display 4 " +LL+" "+LL.display());
		
		LL.addNode(3);
		System.out.println("Display 5 " +LL+" "+LL.display());
	}
}
