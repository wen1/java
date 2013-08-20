import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListQueueTest {

	@Test
	public void testDequeue() {
		LinkedListQueue queue = new LinkedListQueue();
		for (int i = 0; i<10;i++){
			queue.enqueue(new Integer(i));
		}
		int[] dequeueElems = {0,1,2,3,4};
		for (int i = 0; i<5; i++){
			assertEquals(dequeueElems[i],((Integer)queue.dequeue()).intValue());
		}
		int result[] = {5,6,7,8,9};
 		for(int i = 0; i<5; i++){
			assertEquals(result[i],queue.get(i));
		}
	}

	@Test
	public void testEnqueue() {
		LinkedListQueue queue = new LinkedListQueue();
		for (int i = 0; i<10;i++){
			queue.enqueue(new Integer(i));
		}
		int[] result = {0,1,2,3,4,5,6,7,8,9};
		for (int i = 0; i<10;i++){
			//System.out.println(((Integer)queue.get(i)).intValue());
			assertEquals(result[i],((Integer)queue.get(i)).intValue());
		}
	}

	@Test
	public void testIsEmpty() {
		LinkedListQueue queue = new LinkedListQueue();
		assertEquals(true, queue.isEmpty());
		queue.enqueue(new Integer(1));
		assertEquals(false, queue.isEmpty());
		queue.dequeue();
		assertEquals(true,queue.isEmpty());
	}

	@Test
	public void testGetFront() {
		LinkedListQueue queue = new LinkedListQueue();
		assertEquals(null,queue.getFront());
		for (int i = 0; i<10;i++){
			queue.enqueue(new Integer(i));
		}
		assertEquals(0,((Integer)queue.getFront()).intValue());
	}

	@Test
	public void testClear() {
		LinkedListQueue queue = new LinkedListQueue();
		for (int i=0; i<10; i++){
			queue.enqueue(new Integer(i));
		}
		queue.clear();
		for (int i=0; i<10; i++){
			assertEquals(null,queue.get(i));
		}
	}



}
