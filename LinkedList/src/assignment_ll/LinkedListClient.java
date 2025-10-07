package assignment_ll;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		for(char c='a';c<='z';c++) {
			ll.insertAtEnd(c);
		}
		ll.printll();

	}

}
