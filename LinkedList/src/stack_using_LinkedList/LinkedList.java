package stack_using_LinkedList;

public class LinkedList {

	private Node top;
	
	LinkedList(){
		top=null;
	}
	
	public Node createNode(int val) {
		Node newNode=new Node(val);
		return newNode;
	}
	
	public void push(int value) {
		
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
		int val=-1;
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
