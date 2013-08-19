import java.util.Vector;


public class Queue implement QueueInterface{
	Vector objects;
	int first,last;
	
	Queue(){
		first = -1;
		last = -1; 
		objects = new Vector();
	}
	
	public Object dequeue(){
		
	}
	public void enqueue(Object item){
		objects.add(item);
		if (isEmpty()) first = 
	}
	public boolean isEmpty(){
		return first == last;
	}
}
