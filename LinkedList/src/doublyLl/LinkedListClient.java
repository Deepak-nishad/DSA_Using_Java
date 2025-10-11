package doublyLl;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		
	ll.inserAtend();
	ll.inserAtend();
	ll.inserAtend();
	ll.inserAtend();
//	ll.inserAtend();
	
	ll.display();
	System.out.println();
	
	ll.insertByValue(20);
//	ll.insertAtFirst();
//	ll.insertAtFirst();
	ll.display();
	
	System.out.println();
	ll.deleteFirstNode();
	ll.display();
	System.out.println();
	
	ll.delteLastNode();
	ll.display();
	
	
		
	


		
	}

}
