class Node{
	int data;
	Node next; 
	Node(int data){
		this.data=data;
	}
}
class NodePractice{
	public static void main(String args[]){
		Node n1 = new Node(100);
		Node n2 = new Node(200);
		Node n3 = new Node(300);
		Node n4 = new Node(400);
		Node n5 = new Node(500);
		Node n6 = new Node(600);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		Node temp = n1;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println("\b\b]");
		
		temp = n1;
		System.out.print("Index for 400 : ");
		int index = 0;
		while(temp!=null){
			if(temp.data==400){
				System.out.print(index);
				break;
			}
			temp = temp.next;
			index++;
			if(temp==null){
				index=-1;
				System.out.print(index);
			}
		}
	}
}
