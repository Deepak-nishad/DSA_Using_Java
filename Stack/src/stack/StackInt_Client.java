package stack;

import java.util.Scanner;

public class StackInt_Client {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		StackInt  s = new StackInt();
		
		int option=0,size=0,value=0;
		do
		{
		    System.out.println("----------Menu-------");
		    System.out.println("1.InitStack"+
		                       "\n2.Push"+
		    		           "\n3.Pop"+
		                       "\n4.Display"+
		    		           "\n0: Exit");
		    System.out.println("Enter your choice:: ");
		    option = sc.nextInt();
			
		    switch(option)
		    {
		    
		    case 1:
		    	System.out.println("Enter size of stack: ");
		    	size = sc.nextInt();
		    	
		    	
		    	
		    	s.initStack(size);
		    	break;
		    case 2:
		    	System.out.println("Enter value to push::");
		    	value = sc.nextInt();
		    	s.Push(value);
		    	System.out.println("Value pushed");
		    	break;
		    case 3:
		    	value = s.Pop();
		    	if(value!=-1)
		    	{
		    		System.out.println("\tPopped:: "+value);
		    	}
		        break;
		    case 4:
		    	System.out.println("--------------------\n");
		    	s.display();
		    	System.out.println("\n--------------------\n");
		    	break;
		    case 5:
		    	System.exit(0);
		    }//switch
		    
		}while(option!=0);
		
		sc.close();
	}

	}


