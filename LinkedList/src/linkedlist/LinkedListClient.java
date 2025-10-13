package linkedlist;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
//		ll.insertAtHead();
//		ll.insertAtHead();
//		ll.insertAtHead();
//		ll.insertAtHead();
//		ll.printll();
		
		ll.addAtEnd();
		ll.addAtEnd();
		ll.addAtEnd();
		ll.addAtEnd();
		ll.addAtEnd();
		ll.printll();
//		System.out.println();
//		ll.insertbyvalue(30);
//		System.out.println("After insert by value : ");
//		ll.printll();
		
		System.out.println("Max value is : -");
		int max=ll.maxAndMin();
		System.out.println(max);
		
		System.out.println("min value is : -");
		int min=ll.maxAndMin();
		System.out.println(min);
		
		System.out.println("Occurence is 20 is :- ");
		int occurence=ll.FindOccurence(20);
		System.out.println(occurence);


	}

}
