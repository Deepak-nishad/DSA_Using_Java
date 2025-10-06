package stack;

public class Stack {
	
	private int size;
	private int top;
	private char arr[];
	
	Stack(){
		this.size=0;
		this.top=-1;
		this.arr=null;
	}
	
	public void initStack(int len) {
		this.top=-1;
		this.size=len;
		arr=new char[size];
		
	}
	
	public boolean checkfull() {
		if(top==size-1) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty() {
		
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public void push(char ch) {
		
		if(!checkfull())
		{
			this.top++;
			arr[top]=ch;
		}
		else {
			System.out.println("Stack is full \n");
		}
		
	}
	
	public char pop() {
		
		if(!isEmpty()) {
			char ch=arr[top];
			System.out.println("Value poped::"+ ch);
			top--;
		
		}
		return 'N';
	
	}
	
}