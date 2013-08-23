import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortStackTest {
	public SortStack st;
	@Before
	public void setUp() throws Exception {
		st = new SortStack();
		int[] input = {4,7,6,3,1,2};
		for (int i=0; i<input.length; i++){
			st.push(new Integer(input[i]));
		}
	}

	@Test
	public void testSort() {
		st.sort();
		int[] output = {7,6,4,3,2,1};
		for (int i=0; i<output.length; i++){
			assertEquals(output[i], ((Integer)st.pop()).intValue());
		}
	}

}
