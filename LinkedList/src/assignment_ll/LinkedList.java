package assignment_ll;

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
	
//	public Node createNode() {
//		
//		Node newNode=null;
//		newNode=new Node();
//		System.out.println("Enter value : ");
//		char val=(char) sc.nextInt();
//		newNode.setData(val);
//		newNode.setNext(null);
//		
//		return newNode;
//		
//	}
	
	
	
	public void insertAtEnd(char ch) {
		Node newNode=new Node(ch);
		Node temp=head;
		if(head==null)
		{
			head=newNode;
			return;
			
		}
		
		
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		temp.setNext(newNode);
		//head=temp;
		
		
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
