import static org.junit.Assert.*;

import org.junit.Test;


public class ps2_1Test {

	@Test
	public void testRemoveDuplicates() {
		LinkList lst = new LinkList();
		int input[] = {1,2,3,2,1};
		int result[] = {1,2,3};
		for (int i=0; i<input.length; i++){
			lst.addToTail(input[i]);
		}
		ps2_1.removeDuplicates(lst);
		assertEquals(result.length,lst.length);
		for (int i=0; i<lst.length; i++){
			assertEquals(result[i],	lst.getAtIndex(i));
		}
	}
	@Test
	public void testRemoveDuplicates2() {
		LinkList lst = new LinkList();
		int input[] = {1,2,3,2,1};
		int result[] = {1,2,3};
		for (int i=0; i<input.length; i++){
			lst.addToTail(input[i]);
		}
		ps2_1.removeDuplicates2(lst);
		assertEquals(result.length,lst.length);
		for (int i=0; i<lst.length; i++){
			assertEquals(result[i],	lst.getAtIndex(i));
		}
	}
}
