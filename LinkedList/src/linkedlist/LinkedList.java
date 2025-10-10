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
	
	public void addAtEnd()
	{
		Node newnode = createNode();
		Node temp=head;
		
		if(head==null) //LL is empty
		{
			head  =newnode;
		}
		else
		{
			//search for last node
			while(temp.getNext()!=null)
			{
				temp = temp.getNext();
			}
			//connect last node i.e. temp with newnode
			temp.setNext(newnode);				
		}//else
		
	}//addAtEnd
	
	public void insertbyvalue(int val) {
		Node newNode=createNode();
		Node temp=head;
		// when head is null
		if(head==null) {
			System.out.println("Linked list is empty ");
		}
		// only for one node 
		else if(temp.getNext()==null) {
			if(temp.getData()==val)
			{
				temp.setNext(newNode);
			}else {
				System.out.println("Not found");
			}
		}
		else  {
			while(temp!=null  && temp.getData()!=val ) {
				temp=temp.getNext();
			}
			
			if(temp!=null) {
				newNode.setNext(temp.getNext());
				 temp.setNext(newNode);
			}
			else {
				System.out.println("Not found");
			}
			
			
		}
		
	
	
	
		
		
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
