package stack_using_LinkedList;

public class Node {

	private int data;
	private Node next;
	
	public Node()
	{
		data = 0;
		next = null;
	}
	
	public Node(int val)
	{
		data = val;
		next = null;
	}
	
	public void setData(int value)
	{
		data = value;
	}
	public int getData()
	{
		return data;
	}
	
	public void setNext(Node newnode)
	{
		next = newnode;
	}
	public Node getNext()
	{
		return next;
	}	
	
	
}//class











