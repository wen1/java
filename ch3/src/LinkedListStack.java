
public class LinkedListStack implements StackInterface{
	class Node{
		Object data;
		Node next;
		Node(Object d){
			data = d;
			next = null;
		}
	}

	Node top;
	
	LinkedListStack(){
		top = null;
	}
	
	public Object pop(){
		Object result = this.peek();
		if (result != null) {
			top = top.next;
		} 
		return result;
	}
	public void push(Object item){
		Node n = new Node(item);
		n.next = top;
		top = n;
	}
	
	public Object peek(){
		if (this.isEmpty()) return null;
		return this.top.data;
	}
	public boolean isEmpty(){
		return top == null;
	}
}
