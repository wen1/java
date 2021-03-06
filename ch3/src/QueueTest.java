import static org.junit.Assert.*;

import org.junit.Test;


public class QueueTest {

	@Test
	public void testDequeue() {
		Queue queue = new Queue();
		for (int i = 0; i<10;i++){
			queue.enqueue(new Integer(i));
		}
		int[] dequeueElems = {0,1,2,3,4};
		for (int i = 0; i<5; i++){
			assertEquals(dequeueElems[i],((Integer)queue.dequeue()).intValue());
		}
		for(int i=0; i<5; i++){
			assertEquals(null, queue.get(i));
		}
		int result[] = {5,6,7,8,9};
 		for(int i = 5; i<10; i++){
			assertEquals(result[i-5],queue.get(i));
		}
	}

	@Test
	public void testEnqueue() {
		Queue queue = new Queue();
		for (int i = 0; i<10;i++){
			queue.enqueue(new Integer(i));
		}
		int[] result = {0,1,2,3,4,5,6,7,8,9};
		for (int i = 0; i<10;i++){
			assertEquals(result[i],((Integer)queue.get(i)).intValue());
		}
	}

	@Test
	public void testIsEmpty() {
		Queue queue = new Queue();
		assertEquals(true, queue.isEmpty());
		queue.enqueue(new Integer(1));
		assertEquals(false, queue.isEmpty());
		queue.dequeue();
		assertEquals(true,queue.isEmpty());
	}

	@Test
	public void testGetFront() {
		Queue queue = new Queue();
		assertEquals(null,queue.getFront());
		for (int i = 0; i<10;i++){
			queue.enqueue(new Integer(i));
		}
		assertEquals(0,((Integer)queue.getFront()).intValue());
	}

	@Test
	public void testClear() {
		Queue queue = new Queue();
		for (int i=0; i<10; i++){
			queue.enqueue(new Integer(i));
		}
		queue.clear();
		for (int i=0; i<10; i++){
			assertEquals(null,queue.get(i));
		}
	}


	@Test
	public void testDoubleSize() {
		Queue queue = new Queue();
		for (int i=0; i<20; i++){
			queue.enqueue(new Integer(i));
		}
		assertEquals(20,queue.getCap());
	}

}
