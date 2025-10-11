package doublyLl;

import java.util.Scanner;

public class LinkedList {

	private Node head;
	Scanner sc = new Scanner(System.in);

	public LinkedList() {
		head = null;
	}

	public void setHead(Node newNode) {
		head = newNode;
	}

	public Node createNode() {

		Node newNode = new Node();
		System.out.println("Enter data to create node : ");
		int data = sc.nextInt();
		newNode.setData(data);
	
		return newNode;
	}

	public void inserAtend() {
		Node newNode = createNode();
		Node temp = head;
		if (head == null) {
			head = newNode;
			
		}// if end 
		else if (head.getNext() == null) { // only one node
			temp = head;
			temp.setNext(newNode);
			newNode.setPrev(temp);
			
		} // else if end
		else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			} // while end
			temp.setNext(newNode);
			newNode.setPrev(temp);

		}// else end;

	} // insertAtend End here
	
	public void insertAtFirst() {
		if(head==null) {
			System.out.println("ll is empty ");
			return;
		}
		
		Node newNode = createNode();
		newNode.setNext(head);
		head.setPrev(newNode);
		head=newNode;
		
		
	}
	
	public void insertByValue(int val) {
		Node newNode = createNode();
		Node temp=head;
		if(head==null) {
			System.out.println("ll is empty : ");
			return ;
		}
		else if(temp.getNext()==null && temp.getData()==val){
			
			temp.setNext(newNode);
			newNode.setPrev(temp);
			return;
			
		}
				
		else {
			while(temp!=null && temp.getData()!=val ) {
				temp=temp.getNext();
			}
			
			newNode.setNext(temp.getNext());
			temp.getNext().setPrev(newNode);
			temp.setNext(newNode);
			newNode.setPrev(temp);
			
		}
	}

	public void deleteFirstNode() {
		Node temp=head;
		if(head==null) {
			System.out.println("ll is empty : ");
		}
		else if(temp.getNext()==null) {
			head=null;
		}
		else {
			head=head.getNext();
			head.setPrev(null);
			temp.setNext(null);
			temp.setPrev(null);
		}
	}
	
	public void delteLastNode() {
		Node temp=head;
		if(head==null) {
			System.out.println("Node is empty : - ");
		}
		else if(head.getNext()==null)
		{
			head=null;
			head.setPrev(null);
		}
		else {
			while(temp.getNext().getNext()!=null) {
				temp=temp.getNext();
				
			}
			temp.getNext().setPrev(null);
			temp.setNext(null);
			
		}
	}
	
	public void delteInBetween(int val) {
		Node temp=head;
		if(head==null) {
			System.out.println("Node is empty : - ");
		}
		else if(head.getNext()==null)
		{
			if(head.getData()==val)
			{
				head=null;
				head.setPrev(null);
			}
			else {
				System.out.println("Not not found");
			}
			
		}
		
		else {
			while(temp!=null && temp.getData() !=val) {
				temp=temp.getNext();
			}
			
			if(temp!=null) {
				
			}
			
			
			
		}
	}
	
	
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("dll is empty");
		}
		else {
			System.out.print("<-null->");
			while(temp!=null) {
				System.out.print(temp.getData()+" <-> ");
				temp=temp.getNext();
			}
			System.out.print("<-null->");	
		}
	
	}
	
	
}
