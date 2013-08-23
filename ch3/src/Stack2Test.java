import static org.junit.Assert.*;

import org.junit.Test;


public class Stack2Test {

	@Test
	public void testPop() {
		
	}

	@Test
	public void testPush() {
		Stack2 st = new Stack2();
		int[] input = {4,5,2,1,3};
		for (int i=0; i<input.length; i++){
			st.push(new Integer(input[i]));	
		}
		for (int i=0; i<input.length; i++){
			assertEquals(input[i],st.get(i));
		}
	}

	@Test
	public void testMin() {
		// test case 1:
		Stack2 st = new Stack2();
		int[] input = {4,5,2,1,3};
		int[] output = {1,1,2,4,4};
		for (int i=0; i<input.length; i++){
			st.push(input[i]);
		}
		for(int i=0; i<output.length; i++){
			assertEquals(output[i], ((Integer)st.min()).intValue());
			st.pop();
		}
		
		// test case 2:
		Stack2 st2 = new Stack2();
		int[] input2 = {1,2,3};
		int[] output2 = {1,1,1};
		for (int i=0; i<input2.length; i++){
			st2.push(input2[i]);
		}
		for(int i=0; i<output2.length; i++){
			assertEquals(output2[i], ((Integer)st2.min()).intValue());
			st2.pop();
		}
	}

}
