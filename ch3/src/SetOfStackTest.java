import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SetOfStackTest {

	@Test
	public void testPop() {
		int[] result = {19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
		SetOfStack st = new SetOfStack();
		for (int i=0; i<20; i++){
			st.push(new Integer(i));
		}
		int i=0;
		while(!st.isEmpty()){
			int data = ((Integer)st.pop()).intValue();
			assertEquals(result[i], data);
			i++;
		}
	}

	@Test
	public void testPush() {
		SetOfStack st = new SetOfStack();
		for (int i=0; i<20; i++){
			st.push(new Integer(i));
		}
		System.out.println("num of elems:" + st.cap);
		for(int i = 0; i<10; i++){
			int data = ((Integer)st.get(0, i)).intValue();
			assertEquals(i,data);
		}
		for (int i=10; i<20; i++){
			int data = ((Integer)st.get(1, i-10)).intValue();
			assertEquals(i,data);
		}
	}

	@Test
	public void testPeek() {
		SetOfStack st = new SetOfStack();
		for (int i=0; i<20; i++){
			st.push(new Integer(i));
		}
		assertEquals((new Integer(19)), st.peek());
		st.pop();
		st.pop();
		assertEquals((new Integer(17)), st.peek());
	}

	@Test
	public void testIsFull() {
		SetOfStack st = new SetOfStack();
		for (int i=0; i<10; i++){
			st.push(new Integer(i));
		}
		assertEquals(true,st.isFull());
	}

	@Test
	public void testIsEmpty() {
		SetOfStack st = new SetOfStack();
		for (int i=0; i<20; i++){
			st.push(new Integer(i));
		}
		assertEquals(false,st.isEmpty());
		for (int i=0; i<20; i++){
			st.pop();
		}
		assertEquals(true,st.isEmpty());
	}
}
