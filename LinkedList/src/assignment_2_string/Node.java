package assignment_2_string;

public class Node {

	private char data;
	private Node next;
	
	public Node()
	{
		data = 0;
		next = null;
	}
	
	public Node(char val)
	{
		data = val;
		next = null;
	}
	
	public void setData(char value)
	{
		data = value;
	}
	public char getData()
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











