
public class Queue implements QueueInterface{
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] objects;
	private int front,back,curr,cap;
	
	Queue(){
		front = 0;
		back = -1; 
		curr = 0;
		cap = DEFAULT_CAPACITY;
		objects = new Object[10];
	}
	
	public Object dequeue(){
		if(isEmpty()) return null;
		Object result = objects[front];
		objects[front] = null;
		front = (front+1)%cap;
		curr--;
		return result;
	}
	
	public void enqueue(Object item){
		if(isFull()){
			doubleSize();
		}
		back = (back+1)%cap;
		objects[back] = item;
		curr++;
	}
	
	public boolean isEmpty(){
		return curr == 0;
	}
	
	public Object getFront(){
		if (isEmpty()) return null;
		return objects[front];
	}
	
	public void clear() {
		for(int i = front,count = 0; count <curr; i = (i+1)%cap,count++){
			objects[i]=null;
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
		int count = 0;
		for(int i = front; count < curr; i = (i+1)%cap,count++){
			doubleObjects[count] = objects[i];
		}
		front = 0;
		back = count-1;
		cap = cap*2;
		objects = doubleObjects;
	}
	// for test purpose only
	public Object get(int index){
		if (index>= cap) return null;
		return objects[index];
	}
	// for test purpose only
	public int getCap(){
		return cap;
	}
	
}
