
public class Queue implements QueueInterface{
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] objects;
	private int front,back,curr,cap;
	
	Queue(){
		front = 0;
		back = -1; 
		curr = 0;
		cap = DEFAULT_CAPACITY;
		objects = new Object[cap];
	}
	
	public Object dequeue(){
		if(isEmpty()) return null;
		Object result = objects[front%cap];
		objects[front%cap] = null;
		front++;
		curr--;
		return result;
	}
	
	public void enqueue(Object item){
		if(isFull()){
			doubleSize();
		}
		back++;
		objects[back%cap] = item;
		curr++;
	}
	
	public boolean isEmpty(){
		return curr == 0;
	}
	
	public Object getFront(){
		if (isEmpty()) return null;
		return objects[front%cap];
	}
	
	public void clear() {
		for(int i = front; i<=back; i++){
			objects[i%cap]=null;
		}
		front = 0;
		back = -1;
		curr = 0;
	}
	
	public boolean isFull(){
		return curr == cap;
	}
	
	public void doubleSize(){
		Object[] doubleObjects = new Object[cap*2];
		for(int i = front,j=0; i<=back; i++,j++){
			doubleObjects[j] = objects[i%cap];
		}
		front = 0;
		back = cap-1;
		cap = cap*2;
		objects = doubleObjects;
	}
	// for test purpose only
	public Object get(int index){
		if (index >= cap) return null;
		return objects[index];
	}
	// for test purpose only
	public int getCap(){
		return cap;
	}
	
}
