/*
 * 3.6 Write a program to sort a stack in ascending order (with biggest items 
 * on top). You may use at most one additional stack to hold items, but you may 
 * not copy the elements into any other data structure (such as an array). 
 * The stack supports the following operations: push, pop, peek, and isEmpty.
 */
public class SortStack extends Stack{
	private Stack sortedStack;

	public SortStack() {
		super();
		sortedStack = new Stack();
	}
	
	public void sort() {
		while(!isEmpty()){
			if( sortedStack.peek()==null ||
			    getValue(peek()) < getValue(sortedStack.peek()) ) {
				Object temp = pop();
				sortedStack.push(temp);
			} else {
				Object orig = pop();
				Object sorted;
				do{
					sorted = sortedStack.pop();
					push(sorted);
				}while( sortedStack.peek()!=null && 
						getValue(orig) >= getValue(sortedStack.peek()) );
				sortedStack.push(orig);	
			}
		}
		while(!sortedStack.isEmpty()){
			Object temp = sortedStack.pop();
			push(temp);
		}
	}
	
	public int getValue(Object ob){
		return ((Integer)ob).intValue();
	}
}
