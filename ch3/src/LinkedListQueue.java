
public class LinkedListQueue implements QueueInterface{
	public class Node{
		Object data;
		Node next;

		Node(Object d){
			data = d;
			next = null;
		}
	}

	Node front,back;

	LinkedListQueue(){
		front = null;
		back = null;
	}
	public Object dequeue(){
		if (isEmpty()) return null;
		Object result = front.data;
		if (front == back){
			front = null;
			back = null;
		} else {
			front = front.next;
		}
		return result;
	}

	public void enqueue(Object item){
		if (isEmpty()){
			front = new Node(item);
			back = front;
		} else {
			back.next = new Node(item);
			back = back.next;
		}
	}

	public boolean isEmpty(){
		return front == null;
	}

	public Object getFront(){
		if (isEmpty()) return null;
		return front.data;
	}

	public void clear(){
		Node p = front;
		Node next;
		while(p!=null){
			next = p.next;
			p = null;
			p = next;
		}
		front = null;
		back = null;
	}

	// for test
	public Object get(int index){
		Node p = front;
		while(index!=0&&p!=null){
			p = p.next;
			index--;
		}
		return p!=null? p.data: p;
	}

}
