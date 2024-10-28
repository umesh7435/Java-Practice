class Queue{
	Node front;
	public void add(int data){
		Node n1 = new Node(data); //--> 1
		if (front==null){
			front=n1;
		}else{
			// Find the last node --> 2
			Node last = front;
			while(last.next!=null){
				last=last.next;
			}
			last.next = n1; //--> 3
		}
		
	}
	public void remove(){
		if(front!=null){
			front = front.next;
		}
	}
	public void printQueue(){
		Node temp = front;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(isEmpty() ? "empty]":"\b\b]");
	}
	public int search(int data){
		Node temp = front;
		int index = 0;
		while(temp!=null){
			if(temp.data==data){
				return index;
			}
			temp = temp.next;
			index++;
		}
		return -1;
	}
	public void clear(){
		front = null;
	}
	public int size(){
		Node temp = front;
		int index = 0;
		while(temp!=null){
			index++;
			temp = temp.next;
			if(temp==null){
				return index;
			}
		}
		return 0;
	}
	public boolean isEmpty(){
		return front == null;
	}
	public int peek(){
		return front!=null ? front.data:-1;
	}
	public int poll(){
		if(isEmpty()){
			return -1;
		}
		int frontData = front.data;
		remove();
		return frontData; 
	}
	//--------------Inner Class-------------
	class Node{
		private int data;
		private Node next; 
		Node(int data){
			this.data=data;
		}
	}
}
public class LinkedQueue{
	public static void main(String args[]){
		Queue q1 = new Queue();
		q1.printQueue();
		System.out.println("Size of the stack : "+q1.size());
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		
		q1.printQueue();
		System.out.println("Size of the stack : "+q1.size());
		
		System.out.println("\nAfter Popped()...");
		q1.remove();
		q1.printQueue();
		
		System.out.println("\nIndex of 40 : " + q1.search(40));
		System.out.println("\nIndex of 20 : " + q1.search(20));
		
		int frontData = q1.peek();
		System.out.println("\nAfter calling peek : "+frontData);
		q1.printQueue();
		
		frontData = q1.poll();
		System.out.println("\nAfter calling poll : "+frontData);
		q1.printQueue();
		
	}
}
