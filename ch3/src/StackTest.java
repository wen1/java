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
			assertEquals(result[i], ((Integer)st.get(i)).intValue());
		}
	}
	
	@Test
	public void popTest() {
		Stack st = new Stack();
		/*create a stack with five int from 0 to 4*/
		for (int i = 0; i < 5; i++){
			st.push(new Integer(i));
		}
		int result[] = {4,3,2,1,0};
		/*pop the stack and check*/
		for (int i = 0; i<result.length; i++){
			assertEquals(result[i], ((Integer)st.pop()).intValue());
		}
		/**/
		for (int i=0; i< 5; i++){
			assertEquals(null,st.get(i));
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
	public void incrementStacksSizeTest(){
		Stack st = new Stack();
		for (int i=0; i<20; i++){
			st.push(new Integer(i));
		}
		assertEquals(19, ((Integer)st.peek()).intValue());
	}
}
