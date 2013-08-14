import static org.junit.Assert.*;

import org.junit.Test;


public class DoubleLinkListTest {

	@Test
	public void testAddToTail() {
		DoubleLinkList lst = new DoubleLinkList();
		lst.addToTail(1);
		lst.addToTail(2);
		lst.addToTail(3);
		int result[] = {1,2,3};
		for (int i = 0;i < lst.length; i++){
			assertEquals(result[i], lst.getAtIndex(i));
		}
	}

	@Test
	public void testAddToHead() {
		DoubleLinkList lst = new DoubleLinkList();
		lst.addToTail(1);
		lst.addToTail(2);
		lst.addToTail(3);
		lst.addToHead(4);
		int result[] = {4,1,2,3};
		for (int i = 0;i < lst.length; i++){
			assertEquals(result[i], lst.getAtIndex(i));
		}
	}

	@Test
	public void testInsert() {
		DoubleLinkList lst = new DoubleLinkList();
		lst.addToTail(1);
		lst.addToTail(2);
		lst.addToTail(3);
		lst.insert(2,4);
		int result[] = {1,2,4,3};
		for (int i = 0;i < lst.length; i++){
			assertEquals(result[i], lst.getAtIndex(i));
		}
	}
	
	@Test
	public void pointTest(){
		DoubleLinkList lst = new DoubleLinkList();
		lst.addToTail(1);
		DoubleLinkList.Node p1 = lst.tail;
		lst.addToTail(2);
		DoubleLinkList.Node p2 = lst.tail;
		lst.addToTail(3);
		DoubleLinkList.Node p3 = lst.tail;
		
		assertEquals(p1.next, p2);
		assertEquals(p2.pre, p1);
		assertEquals(p2.next, p3);
		assertEquals(p3.pre, p2);
		assertEquals(p3.next, null);
		assertEquals(p1.pre, null);
	}

}
