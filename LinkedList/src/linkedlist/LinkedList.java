package linkedlist;

import java.util.Scanner;

public class LinkedList {
	
	private Node head;
	
	Scanner sc=new Scanner(System.in);
	
	public LinkedList() {
		head=null;
	}
	
	public Node getHead() {
		return head;
		
	}
	
	public void SetHead(Node newNode) {
		head=newNode;
		
	}
	
	public Node createNode() {
		
		Node newNode=null;
		newNode=new Node();
		System.out.println("Enter value : ");
		int val=sc.nextInt();
		newNode.setData(val);
		newNode.setNext(null);
		
		return newNode;
		
	}
	
	public void insertAtHead() {
		
		Node newNode= createNode();
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.setNext(head);
			head=newNode;
		}
	}
	
	public void insertAtEnd() {
		
	}
	
	public void printll() {
		Node temp=head;
		if(head==null) {
			System.out.println("LinkedList is empty");
		}
		
		while(temp!=null) {
			System.out.print(temp.getData()+" -> ");
			temp=temp.getNext();
		}
		System.out.print("null");
		
	}
	
	

}
