package queue;

public class Queue {
	int size;
	int arr[];
	int front;
	int rear;
	
	Queue(){
		this.size=0;
		arr=null;
		 front=-1;
		 rear=-1;
	}
	
	public void initQueue(int size) {
		this.size=size;
		arr=new int[size];		
	}
	public boolean isfull() {
		if(rear==size-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(front==rear) {
			return true;
		}
		return false;
	}
	
	
	public void enqueue(int val) {
		if(!isfull()) {
			rear++;
			arr[rear]=val;
		}
		else {
			System.out.println("Queue is full ");
		}
	}
	
	public void dequeue() {
		int value=-1;
		if(! isEmpty()) {
			front++;
			value=arr[front];
			System.out.println("Value is dequeu : "+value);
		}
		else {
			System.out.println("No element : - "+value);
		}
	}
	
	public void display() {
		for(int i=front+1; i<=rear;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	

}


