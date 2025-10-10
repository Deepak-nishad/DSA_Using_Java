package stack_using_LinkedList;

public class Stack_Using_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);
		ll.push(70);
		

		ll.printll();
		
		int val=ll.pop();
		System.out.println("Top value is "+ val);
		 val=ll.pop();
		System.out.println("Top value is "+ val);
		
		 val=ll.pop();
		System.out.println("Top value is "+ val);
		 val=ll.pop();
		System.out.println("Top value is "+ val);
		 val=ll.pop();
		System.out.println("Top value is "+ val);
	}

}
