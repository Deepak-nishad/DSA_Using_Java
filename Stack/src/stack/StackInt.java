package stack;

import java.util.Scanner;

public class StackInt {
	 private int size;
	    private int top;
	    private int stk[];
	    
	    Scanner sc = new Scanner(System.in);
	    
	    public StackInt()
	    {
	    	size=0;
	    	top = -1;
	    	stk = null;    	
	    }
	    
	    //OR
	    public void initStack(int size)
	    {
	    	this.size = size;
	    	top = -1;
	    	stk = new int[this.size];    	
	    }
	    
	    public boolean isFull()
	    {
	    	if(top == size-1)
	    		return true;
	    	else
	    		return false;
	    }
	    
	    public boolean isEmpty()
	    {
	    	if(top == -1)
	    		return true;
	    	else
	    		return false;
	    }
	    
	    public void Push(int value)
	    {
	    	/*  boolean n = isFull()
	    	 *  if(n==false)
	    	 * */
	    	
	    	if(!isFull())
	    	{    		
	    		top++;
	    		stk[top] = value;
	    		//OR
	    		//stk[++top] = value;
	    	}
	    	else
	    		System.out.println("\tStack OVERFLOW......!!!!!\n");
	    }//push()
	    
	    public int Pop()
	    {
	    	int value = -1;
	    	if(!isEmpty())
	    	{
	    		value = stk[top];
	    		top--;
	    		return value;
	    	}
	    	else
	    	{
	    		System.out.println("\nStack UNDERFLOW....!!!!!");
	    		return value;
	    	}    	
	    	
	    }//pop()
	    
	    public void display()
	    {
	    	if(!isEmpty())
	    	{
		    	for(int i=top;i>-1;i--)
		    	{
		    		System.out.println("\t"+stk[i]);
		    	}
	    	}
	    	else
	    		System.out.println("\nStack UNDERFLOW....!!!!!");
	    	
	    }

}
