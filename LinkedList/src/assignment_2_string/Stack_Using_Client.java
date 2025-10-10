package assignment_2_string;

import java.util.Scanner;

public class Stack_Using_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		System.out.println("Enter String :- ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++) {
			ll.push(str.charAt(i));
		}
		
		

		ll.printll();

		
		sc.close();

	}

}
