/*
null<-[1]-><-[2]->null
*/
public class DoubleLinkList {
	public static class Node{
		int data;
		Node pre;
		Node next;
		
		Node(int d){
			this.data = d;
			pre = null;
			next = null;
		}
	}
	
	Node head;
	Node tail;
	int length;
	
	public void addToTail(int d){
		if (this.head == null){
			head = new Node(d);
			tail = head;
		} else {
			tail.next = new Node(d);
			tail.next.pre = tail;
			tail = tail.next;
		}
		this.length++;
	}
	
	public void addToHead(int d){
		if (this.head == null){
			head = new Node(d);
			tail = head;
		} else {			
			head.pre = new Node(d);
			head.pre.next = head;
			head = head.pre;
		}
		this.length++;
	}
	
	// key is unique
	public void insert(int key, int newKey){
		Node p = this.head;
		while(p!=null){
			if (p.data == key){
				Node node = new Node(newKey);
				node.next = p.next;
				p.next.pre = node;
				p.next = node;
				node.pre = p;
				this.length++;
				break;
			} else {
				;
			}
			p = p.next;
		}
	}
	
	public Object getAtIndex(int i){
		if (this.length<=i) return null;
		Node p = this.head;
		while(i!=0){
			p = p.next;
			i--;
		}
		return p.data;
	}
	
}
