import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListStackTest {

	@Test
	public void pushTest(){
		LinkedListStack st = new LinkedListStack();
		for (int i = 0; i < 5; i++){
			st.push(new Integer(i));
		}
		int result[] = {4,3,2,1,0};
		LinkedListStack.Node p = st.top;
		int i = 0;
		while(p!=null){
			assertEquals(result[i], ((Integer)p.data).intValue());
			p = p.next;
			i++;
		}
	}
	
	@Test
	public void popTest() {
		LinkedListStack st = new LinkedListStack();
		for (int i = 0; i < 5; i++){
			st.push(new Integer(i));
		}
		int result[] = {4,3,2,1,0};
		for (int i = 0; i<result.length; i++){
			assertEquals(result[i], ((Integer)st.pop()).intValue());
		}
	}
	
	@Test
	public void peekTest(){
		LinkedListStack st = new LinkedListStack();
		assertEquals(null, st.peek());
		int result[] = {0,1,2,3,4};
		for (int i = 0; i < 5; i++){
			st.push(new Integer(i));
			assertEquals(result[i], ((Integer)st.peek()).intValue());
		}
		
	}
	
	@Test
	public void isEmptyTest(){
		LinkedListStack st = new LinkedListStack();
		for (int i = 0; i < 5; i++){
			st.push(new Integer(i));
		}
		for (int i = 0; i < 5; i++){
			st.pop();
		}
		assertEquals(true,st.isEmpty()); 
	}
	
	@Test
	public void test(){
		LinkedListStack st = new LinkedListStack();
		for (int i=0; i<20; i++){
			st.push(new Integer(i));
		}
		assertEquals(19, ((Integer)st.peek()).intValue());
	}
}
