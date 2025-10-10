package assignment_2_string;

public class LinkedList {

	private Node top;
	
	LinkedList(){
		top=null;
	}
	
	public Node createNode(char val) {
		Node newNode=new Node(val);
		return newNode;
	}
	
	public void push(char value) {
		
		Node newNode=createNode(value);
		if(top==null)
		{
			top=newNode;
			return ;
		}
		else {
			newNode.setNext(top);
			top=newNode;
		}
	}
	
	public int pop() {
		char val='/';
		if(top==null) {
			System.out.println("Nothing in stack");
		}
		if(top!=null)
		{
			 val=top.getData();
			top=top.getNext();
		}
		return val;
	}
	
	public void printll() {
		Node temp=top;
		if(temp==null) {
			System.out.println("Nothing in stack");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.getData()+ " -> ");
				
				temp=temp.getNext();
			}
			System.out.println("null");
		}
		
	}
	
}
