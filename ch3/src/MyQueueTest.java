import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyQueueTest {
	MyQueue que = new MyQueue();
	@Before
	public void setUp() throws Exception {
		for (int i=0; i< 15; i++){
			que.enqueue(new Integer(i));
		}
	}

	@After
	public void tearDown() throws Exception {
		que.clear();
		que = null;
	}

	@Test
	public void testDequeue() {
		for (int i=0; i<15; i++){
			assertEquals(i,((Integer)que.dequeue()).intValue());
		}
	}

	@Test
	public void testEnqueue() {
		// before 0~14, after 5~14
		for (int i=0; i<5; i++){
			assertEquals(i,((Integer)que.dequeue()).intValue());
		} 
		// after 5~14 0~6
		for (int i=0; i<7; i++){
			que.enqueue(new Integer(i));
		}
		
		int[] result = {5,6,7,8,9,10,11,12,13,14,0,1,2,3,4,5,6};
		for (int i=0; i<17; i++){
			assertEquals(result[i], ((Integer)que.dequeue()).intValue());
		}
		
	}

	@Test
	public void testGetFront() {
		assertEquals(0,((Integer)que.getFront()).intValue());
	}

}
