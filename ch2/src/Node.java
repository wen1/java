
public class Node {
	int data;
	Node next = null;
	
	public Node(int d) {
		data = d;
	}
	public Node(Node n){}
	
	public void addToTail(int d){
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = new Node(d);
	}
	public int get(int i){
		Node p = this;
		while(i!=0){
			p = p.next;
			i--;
		}
		return p.data;
	}
	
	public static void foo(Node lst){
		if (lst == null){
			System.out.println("the lst is empty");
		}else {
			System.out.println("the lst is not empty");
		}
	}
}
