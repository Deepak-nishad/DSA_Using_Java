package assignment_ll;

public class Node {

	private char data;
	private Node next;
	
	public Node() {
	this.data=0;
	this.next=null;
	}

	public Node(char ch) {
		this.data=ch;
		this.next=null;
		}
	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	

	
	
}
