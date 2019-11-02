package LinkedListPractice;

public class LinkedList {
	private Node first;
	
class Node{
	public int num;
	public Node next;
	
public void LinkedList() {
	first = null;
}
	Node(int num){
		this.num = num;
		next = null;
	}
	public Node() {
		// TODO Auto-generated constructor stub
	}}

public void addNodeFront(int n) {
	Node newNode = new Node();
	newNode.num = n;
	newNode.next = first;
	first = newNode;
}

public void addNodeEnd(int n) {
	Node temp = new Node(n);
	Node current = first;
	temp.num = n;
	while(current.next != null) {
		current = current.next;
		current.next = temp;
	}
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
	String num = " ";
	while (current.next != null) {
		num += " " + current.num+" -- ";
		current = current.next;
	}
	num +=" "+current.num+" -- ";
	return num;
}

public static void main (String [] args) {
	LinkedList listOne = new LinkedList();
	
	System.out.println(listOne.display());
	
	listOne.addNodeFront(5);
	listOne.addNodeFront(4);
	listOne.addNodeFront(3);
	listOne.addNodeFront(2);
	
	System.out.println("display1 "+listOne+" " +listOne.display());

}
}