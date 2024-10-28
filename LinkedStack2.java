
class Stack{
	Node top;
	public void push(int data){
		Node n1 = new Node(data);
		n1.next = top;
		top = n1;
	}
	public void pop(){
		if(top!=null){
			top = top.next;
		}
	}
	public void printStack(){
		Node temp = top;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(isEmpty() ? "empty]":"\b\b]");
	}
	public int search(int data){
		Node temp = top;
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
		top = null;
	}
	public int size(){
		Node temp = top;
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
		return top == null;
	}
	public int peek(){
		return top!=null ? top.data:-1;
	}
	public int poll(){
		if(isEmpty()){
			return -1;
		}
		int topData = top.data;
		pop();
		return topData; 
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
public class LinkedStack2{
	public static void main(String args[]){
		Stack s1 = new Stack();
		s1.printStack();
		System.out.println("Size of the stack : "+s1.size());
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		s1.printStack();
		System.out.println("Size of the stack : "+s1.size());
		
		System.out.println("\nAfter Popped()...");
		s1.pop();
		s1.printStack();
		
		System.out.println("\nIndex of 40 : " + s1.search(40));
		System.out.println("\nIndex of 20 : " + s1.search(20));
		
		int topData = s1.peek();
		System.out.println("\nAfter calling peek : "+topData);
		s1.printStack();
		
		topData = s1.poll();
		System.out.println("\nAfter calling poll : "+topData);
		s1.printStack();
		
	}
}
