package queue;

public class QueueClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q=new Queue();
		
		
		
		
		q.initQueue(5);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		if(q.isfull()) {
			System.out.println("Queu is full");
		}
		else {
			System.out.println("Queue is not full");
		}
		
	q.display();
		System.out.println();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		System.out.println("After dequeue print funtion\n");
		q.display();
		
		
	}

}
