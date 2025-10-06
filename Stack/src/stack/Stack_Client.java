package stack;

import java.util.Scanner;

public class Stack_Client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
		
		int len=str.length();
		
		Stack s=new Stack();
		s.initStack(len);
		
		for(int i=0;i<str.length();i++) {
			s.push(str.charAt(i));
		}
		
		for(int i=0;i<=str.length();i++) {
			s.pop();
		}
		
		

	}

}
