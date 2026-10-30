
package s1;
public class q3_stack {
		
	int[] stack;
	int size;
	int top;
	public q3_stack(int size) {
		this.stack = new int [size];
		this.size = size;
		this.top = -1;
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isOverflow() {
		if(top==size-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int data) {
		if(isOverflow()) {
			System.out.println("Stack is already full");
		}else {
			stack[++top]=data;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			int x=top;
			top--;
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		System.out.println("peek element is"+stack[top]);
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		System.out.println("Element are: ");
		for(int i=0;i<=top;i++) {
			System.out.print(" "+stack[i]);
		}
	}
	
}
