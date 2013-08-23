/*
 * 3.1  Describe how you could use a single array to implement
 * three stacks.
 * 
 * Fixed division implementation of three stacks
 */
public class Stack1 extends Stack {
	private static Object[] ARRAY = new Object[30];
	private static final int SIZE = 10;
	private int start;
	public static int numOfStack = 0;

	Stack1() {
		if (numOfStack < 3){
			start = numOfStack * SIZE;
			top = start-1;
			numOfStack++;
		} else {
			System.out.println("Constructor: alreay created three stacks");
		}
	}

	@Override
	public void push(Object item){
		if (isFull()) {System.out.println("Push:stack already full"); return;}
		top++;
		ARRAY[top] = item;
	}

	@Override
	public Object pop(){
		Object result = peek();
		if (result != null){
			ARRAY[top] = null;
			top--;
		}
		return result;
	}
	@Override
	public Object peek(){
		if (isEmpty()) return null;
		return ARRAY[top];
	}
	@Override
	public boolean isEmpty(){
		return top == start-1;
	}

	public boolean isFull(){
		return top == start+SIZE-1;
	}

	public static void clear(){
		numOfStack = 0;
	}

	//for tests
	public static Object getItem(int index){
		return ARRAY[index];
	}
	public int getTop(){
		return top;
	}
}