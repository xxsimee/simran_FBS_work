package s2;

public class Doubly {

	Node start;
	
	public void insertBeg(int data) {
		// newNode
		Node newNode=new Node(data);
		
		if(start==null) {
			start=newNode;
			return;
		}
		newNode.next=start;
		start.pre=newNode;
		start=newNode;
	}
	
	public void insertEnd(int data) {
		Node newNode=new Node(data);
		
		if(start==null) {
			start=newNode;
			return;
		}
		
		Node  p= start;
		while(p.next!=null) {
			p=p.next;
		}
		
		newNode.pre=p;
		p.next=newNode;
	}
	
	public void deleteBeg() {
		if(start==null) {
			System.out.println("List is empty");
			return;
		}
		start= start.next;
		if(start!=null) {
			start.pre=null;
		}
		System.out.println("delete");
	}
	
	public void deleteEnd() {
		if(start==null) {
			System.out.println("List is empty");
			return;
		}
		if(start.next==null) {
			start=null;
			System.out.println("delete");
			return;
		}
		
		Node p=start;
		while(p.next!=null) {
			p=p.next;
		}
		p.pre.next=null;
		System.out.println("Node is delete");
	}
	
	public void display() {
	    if(start==null) {
	        System.out.println("List is empty");
	        return;
	    }

	    Node p=start;

	    while(p.next!=null) {
	        System.out.print(p.data+"->");
	        p=p.next;
	    }

	    System.out.println(p.data+"->null");
	}
	
}
