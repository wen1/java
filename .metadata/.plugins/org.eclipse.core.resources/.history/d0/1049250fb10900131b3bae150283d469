import static org.junit.Assert.*;

import org.junit.Test;


public class StackTest {

	@Test
	public void pushTest(){
		Stack st = new Stack();
		for (int i = 0; i < 5; i++){
			st.push(new Integer(i));
		}
		int result[] = {0,1,2,3,4};
		for (int i = 0; i < 5; i++){
			assertEquals(result[i], st.objects.get(i));
		}
	}
	
	@Test
	public void popTest() {
		Stack st = new Stack();
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
		Stack st = new Stack();
		assertEquals(null, st.peek());
		int result[] = {0,1,2,3,4};
		for (int i = 0; i < 5; i++){
			st.push(new Integer(i));
			assertEquals(result[i], ((Integer)st.peek()).intValue());
		}
		
	}
	
	@Test
	public void isEmptyTest(){
		Stack st = new Stack();
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
		Stack st = new Stack();
		for (int i=0; i<20; i++){
			st.push(new Integer(i));
		}
		assertEquals(19, ((Integer)st.peek()).intValue());
	}
}
