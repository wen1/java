import java.util.Vector;

public class Stack implements StackInterface {
	Vector objects;
	int top;
	
	Stack(){
		objects = new Vector(); // Vector Constructs an empty vector so that its internal data array has size 10 
		top = -1;
	}
	
	public Object pop(){
		Object result = this.peek();
		if (result != null) {
			objects.remove(top);
			top--;
		} 
		return result;
	}
	public void push(Object item){
		this.objects.add(item);
		this.top++;
	}
	public Object peek(){
		if (this.isEmpty()) return null;
		return objects.get(top);
	}
	public boolean isEmpty(){
		return top == -1;
	}
}
